package by.tms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path= "/home")
public class HomeController {


    @GetMapping
    public ModelAndView getHome (ModelAndView modelAndView){
        modelAndView.setViewName("home");
        return modelAndView;
    }
}
