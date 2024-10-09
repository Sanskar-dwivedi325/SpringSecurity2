package com.sanskar.SpringSecurity2.controllers;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeController {


    @GetMapping("/")
    public ModelAndView geth(){

        return new ModelAndView("Home");

    }



    @GetMapping("/home")
    public ModelAndView getHome(){

        return new ModelAndView("Home");

    }

    @GetMapping("/login")
    public ModelAndView getLogin(){

       return new ModelAndView("Login");

    }

}
