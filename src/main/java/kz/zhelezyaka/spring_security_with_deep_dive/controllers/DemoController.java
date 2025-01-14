package kz.zhelezyaka.spring_security_with_deep_dive.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello endpoint!";
    }
}
