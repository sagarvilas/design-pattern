package com.example.pattern.decorator.controller;

import com.example.pattern.decorator.service.api.CoffeeService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("decorator")
@RequiredArgsConstructor
public class DecoratorController {

    private @NonNull CoffeeService coffeeService;

    @GetMapping("coffee")
    public @ResponseBody
    String getPrice(@RequestParam String drink, @RequestParam List<String> extras) {
        return coffeeService.cost(drink, extras);
    }
}
