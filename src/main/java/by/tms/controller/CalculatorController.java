package by.tms.controller;

import by.tms.service.CalculatorService;
import by.tms.service.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/calc")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping
    public ModelAndView getCalc(ModelAndView modelAndView){
        modelAndView.setViewName("calculator");
        return modelAndView;
    }

    @PostMapping
    public ModelAndView postCalc (ModelAndView modelAndView, Operation oper){
        Operation result = calculatorService.getResult(oper);
        modelAndView.addObject("result", result);
        return modelAndView;
    }
}
