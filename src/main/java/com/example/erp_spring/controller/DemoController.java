package com.example.erp_spring.controller;

import com.example.erp_spring.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    DemoService demoService;


    @GetMapping("/hello")
    public String hello() {
        return demoService.getMessage();
    }
}