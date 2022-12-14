import org.springframework.stereotype.Controller;

@Controller
public class JokesController extends Joke{

private final JokeService jokeService;

public JokesController(JokeService jokeService){
    this.jokeService = jokeService;
}


public String returnJoke(){
    return jokeService.getJoke();
    // guru.springframework.norris.chuck.ChuckNorrisQuotes.getRandomQuote();
}
    
}
