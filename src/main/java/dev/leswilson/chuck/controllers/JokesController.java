package dev.leswilson.chuck.controllers;

import dev.leswilson.chuck.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping(value = {"/", ""})
    public String getJoke(Model model) {
        String joke = jokeService.getJoke();
        model.addAttribute("joke", joke);
        return "chucknorris";
    }
}
