package com.example.javaprogect.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login() {

        return "Login.jsp";
    }
    @GetMapping("/homepage")
    public String homepage() {
        return "index.jsp";
    }

    @GetMapping("/signup")
    public String signup() {
       return "signup";
    }
}