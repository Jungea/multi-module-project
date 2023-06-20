package com.example.multimoduleproject.singlemodule;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SingleController {

    @GetMapping("/users")
    public String users() {
        return "회원 API";
    }

    @GetMapping("/posts")
    public String posts() {
        return "게시글 API";
    }
}
