package com.fastcampus.keeptheline.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api")
@RestController
// controller (ex AuthController) 와의 차이점
// : requestBody 포함 -> 리턴하는 내용을 전부 리턴!
public class APIAuthController {

    @GetMapping("/sign-up")
    public String signUp(){
        return "done.";
    }
    @GetMapping("/login")
    public String login(){
        return "done.";
    }
}
