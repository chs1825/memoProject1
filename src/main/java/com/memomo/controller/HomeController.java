package com.memomo.controller;

import com.memomo.entity.User;
import com.memomo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/main")
public class HomeController {


    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String index(Model model) {

//        Optional<User> user = userService.getUserById("chs1825");
//        System.out.println(user);
//        model.addAttribute("data", user);

        return "mainPage";

    }
}