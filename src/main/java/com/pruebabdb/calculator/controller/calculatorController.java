package com.pruebabdb.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebabdb.calculator.service.calculatorService;

@RestController
@RequestMapping("/")
public class calculatorController {
    @Autowired
    private calculatorService calculatorService;

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping("/")
    public double calc(@RequestParam double num1, @RequestParam double num2, @RequestParam String operation) {
        double res = calculatorService.operation(num1, num2, operation);
        return res;
    }
}
