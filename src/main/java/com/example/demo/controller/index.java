package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class index {
    @GetMapping("/")
    public String home() {
        return "hello world from docker/jenkins";
    }

}
