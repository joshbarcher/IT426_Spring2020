package edu.greenriver.it.thymeleafdemo.controllers;

import edu.greenriver.it.thymeleafdemo.model.Product;
import edu.greenriver.it.thymeleafdemo.model.Sale;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
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
            Sale.ONCE_A_YEAR_SALE
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

    @RequestMapping("/products/all")
    public String allProducts(Model model)
    {
        //save all products
        model.addAttribute("products", products);
        model.addAttribute("title", "All Products");

        return "all";
    }

    @GetMapping("/products/add")
    public String showProductForm(Model model)
    {
        model.addAttribute("product", new Product());
        return "add_products_form";
    }

    @PostMapping("/products/add")
    public String handleProductForm(@ModelAttribute Product product)
    {
        log.info(product.toString());

        //save to db...

        return "redirect:/products/all";
    }

    @GetMapping("/products/edit/{index}")
    public String editProductForm(Model model, @PathVariable int index)
    {
        Product product = products[index];
        model.addAttribute("product", product);
        return "add_products_form";
    }
}









