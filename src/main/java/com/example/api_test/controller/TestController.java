package com.example.api_test.controller;

import com.example.api_test.dto.ResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String  getHelloWorld(){
        return "Hello World";
    }
    @GetMapping("/test")
    public ResponseEntity getTest(){
        ResponseDto response = new ResponseDto(1L,"user1","password1","nickname1");
        return new ResponseEntity(response,HttpStatus.OK);
    }
}
