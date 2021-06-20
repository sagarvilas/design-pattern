package com.example.pattern.strategy.service;

import com.example.pattern.strategy.service.api.CalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CalculationService {
    private final Map<String, CalculationStrategy> allStrategies;

    public Integer performOperation(String operation, List<Integer> operands) {
        CalculationStrategy cs = allStrategies.get(operation);
        if (cs == null)
            throw new IllegalArgumentException("Operation " + operation + " not supported");
        return cs.calculate(operands.get(0), operands.get(1));
    }
}
