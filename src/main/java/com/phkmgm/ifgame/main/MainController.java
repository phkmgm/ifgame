package com.phkmgm.ifgame.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("mgmtest", "1");
        return "index";
    }
}
