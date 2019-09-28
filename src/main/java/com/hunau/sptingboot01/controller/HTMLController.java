package com.hunau.sptingboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HTMLController {

    @RequestMapping("/address")
    public String address() {
        return "address";
    }
}
