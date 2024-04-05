package edu.miu.cs489.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"", "/"})

public class HomePageController
{
    @GetMapping(value = {"","/elibrary"})
    public String homePage(Model model){
        model.addAttribute("name", "Omar");
        return "home/index";
    }

}
