package com.example.secondproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class secondController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "준혁");
        return "greetings"; // templates/greetings.mustache 이 파일을 알아서 찾아서 브라우져로 전송!
    }

    @GetMapping("/bye")
    public String goodBye(Model model) {
        model.addAttribute("nickname", "준혁");
        return "goodBye";
    }
}


