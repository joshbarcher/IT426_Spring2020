package edu.greenriver.it.springmvcexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grilling")
public class GrillingController
{
    private String[] bakingTips = {
        "Preheat the Grill.",
        "Keep it Clean.",
        "Oil the Food, ArithmeticOpTable.UnaryOp.Not the Grate.",
        "Keep the Lid Down.",
        "Time and Temperature.",
        "Know When to Be Direct, Know When to be Indirect.",
        "Maintaining Temperatures.",
        "Tame the Flame."
    };

    @RequestMapping("/random")
    public String randomTip()
    {
        return "grilling/random_tips";
    }

    @RequestMapping("/")
    public String tips()
    {
        return "grilling/all_tips";
    }

    @RequestMapping("/num_tips")
    public String numTips()
    {
        return "grilling/num_tips";
    }

    @RequestMapping("/{tipId}")
    public String tipById(@PathVariable int id)
    {
        return "grilling/tips_by_id";
    }
}