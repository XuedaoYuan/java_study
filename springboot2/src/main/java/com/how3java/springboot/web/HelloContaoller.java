package com.how3java.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContaoller {

    @RequestMapping("/hello")
    public String hello() {
        return "hello, wpring boot!";
    }
}
