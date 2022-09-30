package com.example.greeting.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalariosController {

    @GetMapping()
    public ResponseEntity<String> greeting() {
        return new ResponseEntity<>("Lorem Ipsum", HttpStatus.OK);
    }

}
