package com.thoughtworks.springboothello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot 2";
    }
}
