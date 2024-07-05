package com.scm.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {
    
    @RequestMapping("/")
    public String index(Model model) {
        System.out.println("index Page");
        model.addAttribute("name", "manu tyagi");
        model.addAttribute("age", "20");
        model.addAttribute("address", "India");
        model.addAttribute("email", "manu@gmail.com");
        model.addAttribute("linkedin", "https://www.linkedin.com/in/thoughtful-manu");
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
    
}
