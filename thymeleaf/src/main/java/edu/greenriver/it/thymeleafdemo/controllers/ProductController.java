package edu.greenriver.it.thymeleafdemo.controllers;

import edu.greenriver.it.thymeleafdemo.model.Product;
import edu.greenriver.it.thymeleafdemo.model.Sale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController
{
    private Product[] products = {
        new Product(
            "fishing pole", 79.99,
            "A must have for any angler.",
            Sale.ON_SALE
        ),
        new Product(
            "computer monitor", 199.99,
            "An LCD panel with 60hz.",
            Sale.ONE_TIME_ONLY
        ),
        new Product(
            "Refrigerator magnets", 1.99,
            "A 5 pack of magnets for the fridge.",
            Sale.NO_SALE
        )
    };

    @RequestMapping("/products")
    public String products(Model model)
    {
        //save a few products for the view
        model.addAttribute("product", products[0]);
        model.addAttribute("highlightedProduct", products[1]);

        return "products";
    }
}









