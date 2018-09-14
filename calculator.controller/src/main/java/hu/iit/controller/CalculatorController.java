package hu.iit.controller;

import hu.iit.CalculatorService;
import hu.iit.CalculatorServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {

    CalculatorService calculatorService = new CalculatorServiceImpl();



    @RequestMapping("/add/{number1}/{number2}")
    @ResponseBody
    public String addition(@PathVariable("number1")double number1, @PathVariable("number2")double number2){
        return  String.valueOf(calculatorService.addition(number1, number2));
    }

    @RequestMapping("/sub/{number1}/{number2}")
    @ResponseBody
    public String substraction(@PathVariable("number1")double number1, @PathVariable("number2")double number2){
        return String.valueOf(calculatorService.substraction(number1, number2));
    }

    @RequestMapping("/mult/{number1}/{number2}")
    @ResponseBody
    public String multiplication(@PathVariable("number1")double number1, @PathVariable("number2")double number2){
        return calculatorService.multiplication(number1, number2)+"";
    }

    @RequestMapping("/div/{number1}/{number2}")
    @ResponseBody

    public String division(@PathVariable("number1")double number1, @PathVariable("number2")double number2){
        return calculatorService.division(number1, number2)+"";
    }



}
