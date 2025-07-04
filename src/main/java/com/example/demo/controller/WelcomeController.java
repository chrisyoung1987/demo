package com.example.demo.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(@AuthenticationPrincipal UserDetails userDetails, Model model) {
        String username = userDetails != null ? userDetails.getUsername() : "ゲスト";
        model.addAttribute("username", username);
        return "welcome";
    }
}
