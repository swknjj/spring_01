package com.icia.ex1.controller;

import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 스프링문법 어노테이션
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }



}
