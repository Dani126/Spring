package sk.jaroslavbeno.springlearn2code.services;

import sk.jaroslavbeno.springlearn2code.model.Movie;
import sk.jaroslavbeno.springlearn2code.model.dto.MovieDTO;

import java.util.List;

public interface MovieService {

    Movie createAndAddMovie();
    Movie createAndAddMovie2();

    MovieDTO getMovieById(Long id);

    List<MovieDTO> getAllMovies();

    List<MovieDTO> findMovieByName(String name);

    MovieDTO addMovie(MovieDTO movieDTO);

    MovieDTO updateMovie(MovieDTO movieDTO, long movieId);

    void deleteMovie(long id);
}
