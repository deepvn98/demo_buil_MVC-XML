package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Getting {
    @GetMapping("/User")
    public String getListUser(){
        return "list";
    }
}
