package com.fastcampus.keeptheline.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController implements ErrorController {

    @GetMapping("/root")
    public String root(){
        return "index";
        // before using thymeleaf -> .html in static
        // after thymeleaf
        // -> index.html in /templates
        // & 기본 페이지는 index.html (얘가 어디에 있든) 로 보여준다.
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }
}
