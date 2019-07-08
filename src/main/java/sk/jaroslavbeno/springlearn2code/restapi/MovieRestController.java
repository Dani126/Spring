package sk.jaroslavbeno.springlearn2code.restapi;

import org.springframework.web.bind.annotation.*;
import sk.jaroslavbeno.springlearn2code.model.Movie;
import sk.jaroslavbeno.springlearn2code.model.dto.MovieDTO;
import sk.jaroslavbeno.springlearn2code.repositories.MovieRepository;
import sk.jaroslavbeno.springlearn2code.services.MovieService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieRestController {

    MovieService movieService;

    public MovieRestController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    List<MovieDTO> getMovies(@RequestParam(required = false) String name){

        if(name!=null && !name.isEmpty()){
            return movieService.findMovieByName(name);
        }else {
            return movieService.getAllMovies();
        }
    }

    @GetMapping("/movies/{id}")
    MovieDTO getMovieById(@PathVariable("id") long movieId){
        return movieService.getMovieById(movieId);
    }

    @PostMapping("/movies")
    MovieDTO addMovie(@RequestBody MovieDTO movieDTO){
        return movieService.addMovie(movieDTO);
    }

    @PutMapping("/movies/{id}")
    MovieDTO updateMovie(@RequestBody MovieDTO movieDTO, @PathVariable("id") long movieId){
        return movieService.updateMovie(movieDTO, movieId);
    }

    @DeleteMapping("movies/{id}")
    void deleteMovie(@PathVariable long id){
        movieService.deleteMovie(id);
    }

}
