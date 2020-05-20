package edu.greenriver.it.securitydemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController
{
    @RequestMapping("/home")
    public String home()
    {
        return "home";
    }

    @RequestMapping("/userpages/home")
    public String upHome()
    {
        return "uphome";
    }

    @RequestMapping("/adminpages/home")
    public String apHome()
    {
        return "aphome";
    }
}
