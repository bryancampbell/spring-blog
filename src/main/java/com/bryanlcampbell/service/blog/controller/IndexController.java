package com.bryanlcampbell.service.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	@RequestMapping("/")
    public String greetingNew(Model model) {
        return "index";
    }
}
