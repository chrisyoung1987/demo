package com.example.demo.controller;

import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/test-login")
    public String login(@RequestParam String username, @RequestParam String password) {

//        UserDetails userDetails = loginService.loadUserByUsername(username);

        return "DB Connection Test Result: true.";
    }
}

