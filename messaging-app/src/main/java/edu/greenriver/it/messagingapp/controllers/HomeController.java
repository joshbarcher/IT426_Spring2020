package edu.greenriver.it.messagingapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    @RequestMapping("/")
    public String home()
    {
        //the job of this method is to return the name
        //of a template
        return "index";
    }
}
