package edu.greenriver.it.springmvcexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
public class CookingTipsController
{
    private Map<String, String[]> tipsByType = new HashMap<>();

    public CookingTipsController()
    {
        tipsByType.put("grilling", new String[] {
                "Preheat the Grill.",
                "Keep it Clean.",
                "Oil the Food, ArithmeticOpTable.UnaryOp.Not the Grate.",
                "Keep the Lid Down.",
                "Time and Temperature.",
                "Know When to Be Direct, Know When to be Indirect.",
                "Maintaining Temperatures.",
                "Tame the Flame."
        });
        tipsByType.put("baking", new String[] {
                "Always Have the Correct Butter Consistency.",
                "Room Temperature is KEY.",
                "Read the Recipe Before Beginning.",
                "Always Have Ingredients Prepped.",
                "Learn How to Measure.",
                "Weigh Your Ingredients.",
                "Get an Oven Thermometer.",
                "Keep Your Oven Door Closed."
        });

        tipsByType.put("steaming", new String[] {
                "Don’t Add Too Much Water.",
                "Boil the Water First.",
                "Don’t Steam For Too Long.",
                "Enhance the Steam By Using Stock & Herbs.",
                "Make Sure the Seal is Air-Tight.",
                "Prepare the Food Before Steaming."
        });
    }

    @RequestMapping("/tip/random/grilling")
    @ResponseBody
    public String randomGrillingTip()
    {
        Random random = new Random();
        String[] tips = tipsByType.get("grilling");
        String tip = tips[random.nextInt(tips.length)];

        return "<h1>Random grilling tip</h1><p>" +
                tip + "</p>";
    }

    @RequestMapping("/tip/grilling")
    @ResponseBody
    public String grillingTips()
    {
        String[] tips = tipsByType.get("grilling");
        String html = "<h1>Grilling Tips</h1><ul>";

        for (int i = 0; i < tips.length; i++)
        {
            html += "<li>" + tips[i] + "</li>";
        }
        return html + "</ul>";
    }

    @RequestMapping("/tip/grilling/num_tips")
    @ResponseBody
    public String grillingNumTips()
    {
        return "<h1>Grilling tips</h1><p>There are " +
                tipsByType.get("grilling").length +
                " tips</p>";
    }

    @RequestMapping("/tip/baking/num_tips")
    @ResponseBody
    public String bakingNumTips()
    {
        return "<h1>Baking tips</h1><p>There are " +
                tipsByType.get("baking").length +
                " tips</p>";
    }

    @RequestMapping("/tip/all")
    @ResponseBody
    public String allTips()
    {
        String html = "<h1>Tips</h1><ul>";

        for (String cookingType : tipsByType.keySet())
        {
            html = printTips(tipsByType.get(cookingType), html);
        }

        return html + "</ul>";
    }

    private String printTips(String[] tips, String html)
    {
        for (int i = 0; i < tips.length; i++)
        {
            html += "<li>" + tips[i] + "</li>";
        }
        return html;
    }
}
