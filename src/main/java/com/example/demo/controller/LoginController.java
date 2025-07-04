package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login-page")
    public String loginPage() {
        return "login"; // login.html を返す（src/main/resources/templates/login.html）
    }
}
