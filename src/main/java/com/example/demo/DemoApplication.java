package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
/*
 * 
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 * @RestController
 * public class HelloController {
 * 
 * @GetMapping("/hello")
 * public String hello() {
 * return "Hello from Spring Boot with Docker and Jenkins!";
 * }
 * }
 */
