package com.example.pattern.factory.config;

import com.example.pattern.factory.api.Pizza;
import com.example.pattern.factory.api.ingredient.Veggies;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
public class PizzaServiceConfig {

    ApplicationContext context;
    List<String> chicagoVeggies = List.of("blackolives", "spinach", "eggplant");
    List<String> NYVeggies = List.of("garlic", "onion", "mushroom", "redpepper");

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Qualifier("ChicagoPizzaVeggies")
    public List<Veggies> ChicagoPizzaVeggies(List<Veggies> veggies) {
        return veggies.stream().filter(x ->
                chicagoVeggies
                        .contains(x.getClass().getSimpleName().toLowerCase()))
                .collect(Collectors.toList());
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Qualifier("NYPizzaVeggies")
    public List<Veggies> NYPizzaVeggies(List<Veggies> veggies) {
        return veggies.stream().filter(x ->
                NYVeggies
                        .contains(x.getClass().getSimpleName().toLowerCase()))
                .collect(Collectors.toList());
    }

//    @Bean
//    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//    @Qualifier("availablePizzas")
//    public Map<String, Pizza> availablePizzas(List<Pizza> pizzas) {
//        return pizzas
//                .stream()
//                .collect(Collectors
//                        .toMap(x -> x.getClass().getSimpleName().toLowerCase(), Function.identity()));
//    }
}
