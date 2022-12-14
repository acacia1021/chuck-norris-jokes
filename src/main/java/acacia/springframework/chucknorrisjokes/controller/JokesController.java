package acacia.springframework.chucknorrisjokes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import acacia.springframework.chucknorrisjokes.model.Joke;
import acacia.springframework.chucknorrisjokes.service.JokeService;


@Controller
public class JokesController extends Joke{

private final JokeService jokeService;

@Autowired //If you only have 1 contructor, you can keave it out
public JokesController(JokeService jokeService){
    this.jokeService = jokeService;
}

@RequestMapping({"/",""})
public String returnJoke(Model model){
    model.addAttribute("joke", jokeService.getJoke());
    return "index";
}
    
}
