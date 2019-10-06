package com.penaboss.springsecurity.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}
