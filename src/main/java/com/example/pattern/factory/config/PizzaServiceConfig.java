package com.example.pattern.factory.config;

import com.example.pattern.factory.service.api.ingredient.Veggies;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
public class PizzaServiceConfig {

    List<String> chicagoVeggies = List.of("blackolives", "spinach", "eggplant");
    List<String> NYVeggies = List.of("garlic", "onion", "mushroom", "redpepper");

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Qualifier("chicagoPizzaVeggies")
    public List<Veggies> chicagoPizzaVeggies(List<Veggies> veggies) {
        return veggies.stream().filter(x ->
                chicagoVeggies
                        .contains(x.getClass().getSimpleName().toLowerCase()))
                .collect(Collectors.toList());
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Qualifier("nYPizzaVeggies")
    public List<Veggies> nYPizzaVeggies(List<Veggies> veggies) {
        return veggies.stream().filter(x ->
                NYVeggies
                        .contains(x.getClass().getSimpleName().toLowerCase()))
                .collect(Collectors.toList());
    }
}
