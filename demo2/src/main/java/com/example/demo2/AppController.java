package com.example.demo2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @RequestMapping("/api/test")
    public String api(){
        return "hello success";
    }
}
