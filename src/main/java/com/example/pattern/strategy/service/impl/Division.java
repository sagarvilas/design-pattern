package com.example.pattern.strategy.service.impl;

import com.example.pattern.strategy.service.api.CalculationStrategy;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("divide")
@RequiredArgsConstructor
public class Division implements CalculationStrategy {

    @Override
    public Integer calculate(@NonNull Integer o1, @NonNull Integer o2) {
        if (o2 == 0)
            throw new IllegalArgumentException();
        return o1 / o2;
    }
}
