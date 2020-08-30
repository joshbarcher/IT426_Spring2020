package edu.greenriver.it.jpademo.controllers;

import edu.greenriver.it.jpademo.entities.Cake;
import edu.greenriver.it.jpademo.services.CakeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class CakeController
{
    private CakeService service;

    public CakeController(CakeService service)
    {
        this.service = service;
    }

    @RequestMapping("/cake/all")
    public String all(Model model)
    {
        model.addAttribute("cakes", service.getAllCakes());
        return "all_cakes";
    }

    @RequestMapping("/cake/{flavor}")
    public String byFlavor(@PathVariable String flavor)
    {
        Optional<Cake> cake = service.getCake(flavor);

        //...

        return "";
    }
}
