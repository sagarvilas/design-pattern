package com.example.pattern.strategy.controller;

import com.example.pattern.strategy.service.CalculationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("strategy")
public class StrategyController {

    private final CalculationService service;

    @GetMapping("/calculate")
    @ResponseBody
    public Integer calculate(@RequestParam String operation, @RequestParam List<Integer> operands) {
        if (operands.size() > 2)
            throw new IllegalArgumentException("Only two operands supported");
        return service.performOperation(operation, operands);
    }
}
