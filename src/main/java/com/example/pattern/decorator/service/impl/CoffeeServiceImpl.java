package com.example.pattern.decorator.service.impl;

import com.example.pattern.decorator.service.api.Beverage;
import com.example.pattern.decorator.service.api.CoffeeService;
import com.example.pattern.decorator.service.impl.decorators.BeverageDecorator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CoffeeServiceImpl implements CoffeeService {

    private final Map<String, Beverage> beverageMap;

    private final Map<String, BeverageDecorator> condimentsMap;

    @Override
    public String getCost(String drink, List<String> extras) {
        Beverage newDrink = beverageMap.getOrDefault(drink.toLowerCase(), null);

        if (newDrink == null)
            return "We do not serve " + drink;

        for (String extra : extras) {
            if (condimentsMap.containsKey(extra)) {
                newDrink = condimentsMap.get(extra).setBeverage(newDrink);
            }
        }
        return newDrink.getDescription() + " = " + newDrink.getCost();
    }
}
