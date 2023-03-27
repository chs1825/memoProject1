package com.memomo.controller.read;

import com.memomo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("/readList")
public class ReadMemo {

//    @Autowired
//    private UserService userService;

    @GetMapping("/readByID")
    public String readMemo(Model model){

//        Optional<User> data = userService.readList("chs1825");
//        model.addAttribute("data",data);



        return "mainPage";
    }
}
