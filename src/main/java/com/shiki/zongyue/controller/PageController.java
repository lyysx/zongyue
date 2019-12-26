package com.shiki.zongyue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class PageController {


    @RequestMapping("/admin/not_logged")
    public String notLogged() {
        return "admin/notLogged";
    }





}
