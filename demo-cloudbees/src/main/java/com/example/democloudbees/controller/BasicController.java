package com.example.democloudbees.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class BasicController {

    @GetMapping(value = "/")
    public HttpEntity<String> apiTest() {
        return new ResponseEntity<>("API RUNNING", HttpStatus.OK);
    }

}
