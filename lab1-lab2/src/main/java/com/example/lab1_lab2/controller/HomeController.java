package com.example.lab1_lab2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/aduna")
    public String addNumbers(@RequestParam("numar1") int numar1,
                             @RequestParam("numar2") int numar2,
                             Model model) {
        int suma = numar1 + numar2;
        model.addAttribute("numar1", numar1);
        model.addAttribute("numar2", numar2);
        model.addAttribute("suma", suma);
        return "rezultat";
    }
}
