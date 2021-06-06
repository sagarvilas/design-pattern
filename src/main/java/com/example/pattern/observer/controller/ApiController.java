package com.example.pattern.observer.controller;

import com.example.pattern.observer.service.api.Publisher;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@AllArgsConstructor
public class ApiController {

    private Publisher messagePublisher;

    @GetMapping("/message")
    @ResponseBody
    public String hello(@RequestParam String type) {
        messagePublisher.setMessage(type);
        return "PUBLISHED";
    }
}
