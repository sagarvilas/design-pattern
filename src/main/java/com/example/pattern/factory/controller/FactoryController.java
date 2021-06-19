package com.example.pattern.factory.controller;

import com.example.pattern.factory.api.PizzaStore;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("factory")
@RequiredArgsConstructor
public class FactoryController {

    private final Map<String, PizzaStore> allStores;

    @GetMapping("pizza")
    public @ResponseBody
    String getPizza(@RequestParam String style, @RequestParam String type) {
        PizzaStore store = allStores.get(style);
        store.orderPizza(type);
        return "";
    }
}
