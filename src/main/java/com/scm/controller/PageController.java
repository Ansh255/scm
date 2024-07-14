package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler ");
        model.addAttribute("name","substring");
        model.addAttribute("Youtube","AnshGandhi");
        return "home";
    }

    //route pages
    @RequestMapping("/about")
    public String about(){
        return "about";
    }

    //services
    @RequestMapping("/services")
    public String service(){
        return "services";
    }
}
