package sk.jaroslavbeno.springlearn2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.jaroslavbeno.springlearn2code.services.MovieService;

@Component
//Spring kontajner(znamená,že patrí do Springu)
public class AppRun {

    @Autowired
    //naťahá závislosti
    MovieService movieService;

    public void run(){
        movieService.createAndAddMovie();
    }
}
