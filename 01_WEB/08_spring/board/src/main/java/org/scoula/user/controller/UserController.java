package org.scoula.user.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.user.dto.UserDTO;
import org.scoula.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user/")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService service;
    @GetMapping("/join")
    public String joinForm() {
        log.info("Navigating to join page");
        return "user/join";
    }

//    @PostMapping("join")
//    public ResponseEntity<UserDTO> create(@RequestBody UserDTO user) {
//        return ResponseEntity.ok(service.create(user));
//    }
@PostMapping("join")
public ResponseEntity<UserDTO> create(@ModelAttribute UserDTO user) {
    log.info("Creating user: " + user);
    UserDTO create = service.create(user);
    return ResponseEntity.ok(create);
}
}
