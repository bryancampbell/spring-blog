package com.bryanlcampbell.service.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
//    @RequestMapping("/greeting")
//    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "redirect:/hello";  
//    }
//    
//    @RequestMapping("/hello")
//    public String greetingNew(@RequestParam(value="name", required=false, defaultValue="World2") String name, Model model) {
//        model.addAttribute("name", name);
//        return "greeting";
//    }
    
    @RequestMapping("/admin")
    public String index(Model model) {
        return "admin";
    }
    
    @RequestMapping("/admin/blog")
    public String listArticles(Model model) {
    	return "admin_blog_article-list";
    }
    
    @RequestMapping("/admin/blog/new")
    public String createArticle(Model model) {
    	return "admin_blog_article-new";
    }
    
    
}
