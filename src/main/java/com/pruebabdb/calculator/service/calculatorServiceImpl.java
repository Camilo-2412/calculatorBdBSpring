package com.pruebabdb.calculator.service;
import org.springframework.stereotype.Service;

@Service
public class calculatorServiceImpl implements calculatorService {

  @Override
  public double operation(double num1, double num2, String operation) {
    switch (operation) {
      case "suma":
        return formatearDecimales(num1 + num2, 3);
      case "-":
        return formatearDecimales(num1 - num2, 3);
      case "*":
        return formatearDecimales(num1 * num2, 3);
      case "/":
        return formatearDecimales(num1 / num2, 3);
      case "c":
        return 0;
    }
    return 0;
  }

  public static Double formatearDecimales(Double numero, Integer numeroDecimales) {
    return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
  }

}
