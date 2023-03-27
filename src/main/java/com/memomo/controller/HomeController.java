package com.memomo.controller;

import com.memomo.entity.User;
import com.memomo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/main")
public class HomeController {

    @Autowired
    private UserService service;


    @GetMapping("/")
    public String index(Model model) {

        List<User> user = service.getUser();
        model.addAttribute("data", user);


        return "mainPage";

    }
}