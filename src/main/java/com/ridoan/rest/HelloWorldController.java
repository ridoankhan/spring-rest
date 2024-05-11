package com.ridoan.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path="/hello")
    public String helloWorld() {
        return "Welcome to the journey of Spring Boot";
    }
}
