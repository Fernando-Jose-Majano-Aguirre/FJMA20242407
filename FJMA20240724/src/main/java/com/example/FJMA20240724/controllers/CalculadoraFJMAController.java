package com.example.FJMA20240724.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
@RequestMapping("/calculadora")
public class CalculadoraFJMAController {

    @GetMapping("/resta")
    public String resta(){
        return "calculadora/restaFJMA";
    }

    @PostMapping("/resta")
    public String performSum(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 - num2;
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        return "calculadora/restaFJMA";
    }

    @GetMapping("/multiplicar")
    public String multiplicar(){
        return "calculadora/multiplicarFJMA";
    }
    @PostMapping("/multiplicar")
    public String performMul(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
        int result = num1 * num2;
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("result", result);
        return "calculadora/multiplicarFJMA";
    }
}
