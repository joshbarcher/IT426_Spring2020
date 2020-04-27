package edu.greenriver.it.springmvcexample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
@RequestMapping("/baking")
public class BakingController
{
    private String[] bakingTips = {
        "Always Have the Correct Butter Consistency.",
        "Room Temperature is KEY.",
        "Read the Recipe Before Beginning.",
        "Always Have Ingredients Prepped.",
        "Learn How to Measure.",
        "Weigh Your Ingredients.",
        "Get an Oven Thermometer.",
        "Keep Your Oven Door Closed."
    };

    @RequestMapping("/random")
    public String randomTip(Model model)
    {
        Random random = new Random();
        String tip = bakingTips[random.nextInt(bakingTips.length)];

        //save the tip to the model as a variable
        model.addAttribute("tip", tip);

        return "baking/random_tips";
    }

    @RequestMapping("/")
    public String tips(Model model)
    {
        model.addAttribute("tips", bakingTips);

        return "baking/all_tips";
    }

    @RequestMapping("/num_tips")
    public String numTips(Model model)
    {
        model.addAttribute("num_tips", bakingTips.length);

        return "baking/num_tips";
    }

    @RequestMapping("/{tipId}")
    public String tipById(Model model, @PathVariable int tipId)
    {
        model.addAttribute("tipId", tipId);
        model.addAttribute("tip", bakingTips[tipId]);

        return "baking/tips_by_id";
    }
}
