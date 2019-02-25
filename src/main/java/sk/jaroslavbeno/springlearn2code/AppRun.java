package sk.jaroslavbeno.springlearn2code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sk.jaroslavbeno.springlearn2code.services.MovieService;

@Component
public class AppRun {

    MovieService movieService;
//
//    public AppRun(MovieService movieService) {
//        this.movieService = movieService;
//    }

    public void run(){
        movieService.createAndAddMovie();
    }

    @Autowired
    public void setMovieService(MovieService movieService) {
        System.out.println("injectujem cez setter");
        this.movieService = movieService;
    }
}
