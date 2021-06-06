package com.example.pattern.decorator.service.api;

import java.util.List;

public interface CoffeeService {

    String cost(String drink, List<String> extras);
}
