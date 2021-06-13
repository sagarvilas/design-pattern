package com.example.pattern.decorator.config;

import com.example.pattern.decorator.service.api.Beverage;
import com.example.pattern.decorator.service.impl.decorators.BeverageDecorator;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
public class CoffeeServiceConfig {


    @Bean
    @Qualifier("beverageMap")
    public Map<String, Beverage> beverageMap(List<Beverage> beverageList) {
        Map<String, Beverage> beverageMap = beverageList
                .stream()
                .filter(x -> !(x instanceof BeverageDecorator))
                .collect(Collectors
                        .toMap(x -> x.getClass().getSimpleName().toLowerCase(), Function.identity()));
        return beverageMap;
    }

    @Bean
    @Qualifier("condimentsMap")
    public Map<String, BeverageDecorator> condimentsMap(List<BeverageDecorator> condimentsList) {
        Map<String, BeverageDecorator> condimentsMap = condimentsList
                .stream()
                .collect(Collectors
                        .toMap(x -> x.getClass().getSimpleName().toLowerCase(), Function.identity()));
        return condimentsMap;
    }
}
