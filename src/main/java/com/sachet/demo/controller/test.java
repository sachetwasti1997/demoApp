package com.sachet.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/test")
public class test {
    @GetMapping
    public ResponseEntity<String> getResponse() {
        return ResponseEntity.ok("This is proof that ingress connection is established");
    }
}
