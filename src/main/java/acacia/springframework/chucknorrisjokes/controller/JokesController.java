package acacia.springframework.chucknorrisjokes.controller;

import org.springframework.stereotype.Controller;

import acacia.springframework.chucknorrisjokes.model.Joke;
import acacia.springframework.chucknorrisjokes.service.JokeService;


@Controller
public class JokesController extends Joke{

private final JokeService jokeService;

public JokesController(JokeService jokeService){
    this.jokeService = jokeService;
}


public String returnJoke(){
    return jokeService.getJoke();
}
    
}
