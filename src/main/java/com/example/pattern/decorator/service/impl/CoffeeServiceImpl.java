package com.example.pattern.decorator.service.impl;

import com.example.pattern.decorator.service.api.Beverage;
import com.example.pattern.decorator.service.api.CoffeeService;
import com.example.pattern.decorator.service.impl.decorators.Milk;
import com.example.pattern.decorator.service.impl.decorators.Mocha;
import com.example.pattern.decorator.service.impl.decorators.Sugar;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CoffeeServiceImpl implements CoffeeService {

    private @NonNull List<Beverage> beverages;

    private Map<String, Beverage> beverageWithNames;

    @PostConstruct
    private void init() {
        beverageWithNames = new HashMap<>();
        beverages.forEach(x -> beverageWithNames.put(x.getDescription().replace(" ", "").toLowerCase(), x));
    }

    @Override
    public String cost(String drink, List<String> extras) {
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
        return newDrink.getDescription() + " = " + newDrink.getCost();
    }
}
