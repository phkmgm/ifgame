package com.phkmgm.ifgame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlayController {
    @RequestMapping("/play")
    public String goplay(Model model){
        // 상상게임 플레이 페이지로 이동
        /*
        * DB Table info
        * make_sangsang
        * make_sangsang_images
        * make_sangsang_memo
        * */
        return "play/play";
    }
}
