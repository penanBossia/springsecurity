package com.penaboss.springsecurity.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public Controller(BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }


    @GetMapping("/admin/{password}")
    public String admin(@PathVariable("password") String password) {

        return bCryptPasswordEncoder.encode(password);
    }
}
