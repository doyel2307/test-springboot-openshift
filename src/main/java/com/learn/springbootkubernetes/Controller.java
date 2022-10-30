package com.learn.springbootkubernetes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    public String index() {
        return "Hello Doyel, Springboot application is running properly";
    }
}
