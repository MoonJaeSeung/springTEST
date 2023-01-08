package com.challenger.board.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @ResponseBody
    @GetMapping("/")
    public String main(){
        return "hello world";
    }
}
