package sk.jaroslavbeno.springlearn2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.jaroslavbeno.springlearn2code.services.MovieService;

@Component
public class AppRun {

    @Autowired
    MovieService movieService;

    public void run(){
        movieService.createAndAddMovie();
    }
}
