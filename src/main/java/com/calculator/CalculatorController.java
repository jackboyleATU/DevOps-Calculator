package com.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController
{
    @GetMapping("/")
    public String showPage()
    {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(
            @RequestParam int num1,
            @RequestParam int num2,
            @RequestParam String operation,
            Model model)
    {
        if ("add".equals(operation)) {
            model.addAttribute("result", Calculator.add(num1, num2));
        } else {
            model.addAttribute("result", "Invalid operation");
        }
        return "index";
    }
}
