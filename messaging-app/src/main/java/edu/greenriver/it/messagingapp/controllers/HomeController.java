package edu.greenriver.it.messagingapp.controllers;

import edu.greenriver.it.messagingapp.repositories.IMessagesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController
{
    private IMessagesRepository repo;

    public HomeController(IMessagesRepository repo)
    {
        this.repo = repo;
    }

    @RequestMapping("/")
    public String home(Model model)
    {
        //save all messages from the repo to our view variable
        model.addAttribute("messages", repo.findAll());

        //the job of this method is to return the name
        //of a template
        return "index";
    }
}
