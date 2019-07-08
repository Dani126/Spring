package sk.jaroslavbeno.springlearn2code.restapi;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.*;
import sk.jaroslavbeno.springlearn2code.model.Movie;
import sk.jaroslavbeno.springlearn2code.model.dto.MovieDTO;
import sk.jaroslavbeno.springlearn2code.repositories.MovieRepository;
import sk.jaroslavbeno.springlearn2code.services.MovieService;

import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("/api")
public class MovieRestController {

    MovieService movieService;

    MovieResourcesAssembler assembler;

    public MovieRestController(MovieService movieService, MovieResourcesAssembler assembler) {
        this.movieService = movieService;
        this.assembler = assembler;
    }

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
    Resource<MovieDTO> getMovieById(@PathVariable("id") long movieId){
        MovieDTO movieDTO = movieService.getMovieById(movieId);
        return assembler.toResource(movieDTO);
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
