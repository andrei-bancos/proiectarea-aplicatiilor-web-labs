package com.example.lab1_lab2.controller;

import com.example.lab1_lab2.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    private List<User> users = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("users", users);
        return "users";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("user", new User());
        return "add-user";
    }

    @PostMapping("/add")
    public String addUser(@ModelAttribute User user) {
        users.add(user);
        return "redirect:/user/";
    }

    @GetMapping("/edit/{index}")
    public String showEditForm(@PathVariable int index, Model model) {
        User user = users.get(index);
        model.addAttribute("user", user);
        model.addAttribute("index", index);
        return "edit-user";
    }

    @PostMapping("/edit/{index}")
    public String editUser(@PathVariable int index, @ModelAttribute User user) {
        users.set(index, user);
        return "redirect:/user/";
    }
}
