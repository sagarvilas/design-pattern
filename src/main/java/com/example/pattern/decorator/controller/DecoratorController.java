package com.example.pattern.decorator.controller;

import com.example.pattern.decorator.service.api.Beverage;
import com.example.pattern.decorator.service.impl.decorators.Milk;
import com.example.pattern.decorator.service.impl.decorators.Mocha;
import com.example.pattern.decorator.service.impl.decorators.Sugar;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("decorator")
@RequiredArgsConstructor
public class DecoratorController {

    private @NonNull List<Beverage> beverages;

    private Map<String, Beverage> beverageWithNames;

    @PostConstruct
    private void init() {
        beverageWithNames = new HashMap<>();
        beverages.forEach(x -> beverageWithNames.put(x.getDescription().replace(" ", "").toLowerCase(), x));
    }

    @GetMapping("coffee")
    public @ResponseBody
    String getPrice(@RequestParam String drink, @RequestParam List<String> extras) {
        Beverage newDrink = beverageWithNames.getOrDefault(drink.toLowerCase(), null);

        if (newDrink == null)
            return "We do not serve " + drink;

        for (String extra : extras) {
            if ("sugar".equalsIgnoreCase(extra)) {
                newDrink = new Sugar(newDrink);
            }
            if ("mocha".equalsIgnoreCase(extra)) {
                newDrink = new Mocha(newDrink);
            }
            if ("milk".equalsIgnoreCase(extra)) {
                newDrink = new Milk(newDrink);
            }
        }
        System.out.println(beverages.size());
        return newDrink.getDescription() + " = " + newDrink.getCost();
    }
}
