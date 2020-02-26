package in.ravir.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * JokeServiceImpl
 */
public class JokeServiceImpl implements JokeService{

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

    
}