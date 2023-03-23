package com.memomo.controller.read;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class ReadMemo {

    public String readMemo(Model model){

        model.addAttribute("data","ss");



        return "";
    }
}
