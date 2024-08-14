package org.scoula.join.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.service.BoardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
@RequiredArgsConstructor
@Slf4j
public class JoinController {

    private final BoardService service;

    @PostMapping("")
    public ResponseEntity<BoardDTO> create(@RequestBody BoardDTO board) {
        return ResponseEntity.ok(service.create(board));
    }

}
