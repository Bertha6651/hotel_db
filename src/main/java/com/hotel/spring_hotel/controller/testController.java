package com.hotel.spring_hotel.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class testController {
    @GetMapping("/Hello")
    public String hello() {
        return "Hello World";
    }
}
