package com.memomo.controller.create;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/memo")
public class Makememo {

    @GetMapping("/")
    public String makeMemo(Model model){

        return "startPage";

    }


}
