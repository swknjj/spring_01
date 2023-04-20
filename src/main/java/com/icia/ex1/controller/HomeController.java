package com.icia.ex1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @GetMapping("/") //  => / 주소로 get 요청이 오는경우 이 메서드 실행
    public String index() {
        return "index";
    }

    // /home 요청 처리
    // 메서드 이름: home, 주소요청방식: get
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    // /wakeup 요청 처리
    @GetMapping("/wakeup")
    public String fun1() {
        return "wakeup";
    }

    // req-param1 요청 처리
    @GetMapping("/req-param1")
    public String reqParam1(HttpServletRequest request) {
        // email값 꺼내기
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        System.out.println("email = " + email);
        System.out.println("password = " + password);
        // 요청방식 조회
        System.out.println("request.getMethod() = " + request.getMethod());
        // 요청 url 조회
        System.out.println("request.getRequestURI() = " + request.getRequestURI());
        return "index";
    }

    @GetMapping("/req-param2")
    public String reqParam2(@RequestParam("name") String name, @RequestParam("age") int age) {
        System.out.println("name = " + name + ", age = " + age);
        return "index";
    }
}
