package com.example.test.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String Return(
            @RequestParam(value = "result", required = false, defaultValue = "0") int a,
            Model model) {
        model.addAttribute("result", a);
        return "home";
    }

    @PostMapping("/result")
    public String PostResult(@RequestParam(value = "variable1", required = true) int a,
                       @RequestParam(value = "variable2", required = true) int b,
                       @RequestParam(value = "operation", required = true) String operation,
                       Model model) {
        int result=0;
        switch (operation)
        {
            case "Plus":
                result=a+b;
                break;
            case "Minus":
                result=a-b;
                break;
            case "Multy":
                result=a*b;
                break;
            case "Divis":
                result=a/b;
                break;
            default:
                result=0;
                break;
        }
        model.addAttribute("result", result);
        return "result";
    }

    @GetMapping("/result")
    public String GetResult(@RequestParam(value = "variable1", required = true) int a,
                             @RequestParam(value = "variable2", required = true) int b,
                             @RequestParam(value = "operation", required = true) String operation,
                             Model model) {
        int result=0;
        switch (operation)
        {
            case "Plus":
                result=a+b;
                break;
            case "Minus":
                result=a-b;
                break;
            case "Multy":
                result=a*b;
                break;
            case "Divis":
                result=a/b;
                break;
            default:
                result=0;
                break;
        }
        model.addAttribute("result", result);
        return "result";
    }
}