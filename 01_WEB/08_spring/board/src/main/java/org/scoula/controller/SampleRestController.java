//package org.scoula.controller;
//
//import lombok.extern.slf4j.Slf4j;
//import org.scoula.dto.BoardDTO;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@Slf4j
//@RequestMapping("/sample")
//public class SampleRestController {
//
//    @ResponseBody
//    @GetMapping("/ex07")
//    public BoardDTO ex07() {
//        log.info("/ex07........");
//        BoardDTO dto = new BoardDTO();
//        dto.setAge(10);
//        dto.setName("홍길동");
//        return dto;
//    }
//
//    @GetMapping("/ex08")
//    public ResponseEntity<String> ex08() {
//        log.info("/ex08..........");
//        // {"name": "홍길동"}
//        String msg = "{\"name\": \"홍길동\"}";
//
//        HttpHeaders header = new HttpHeaders();
//        header.add("Content-Type", "application/json;charset=UTF-8");
//
//        return new ResponseEntity<>(msg, header, HttpStatus.OK);
//    }
//
//
//}
