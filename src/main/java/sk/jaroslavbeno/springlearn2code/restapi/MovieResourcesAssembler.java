package sk.jaroslavbeno.springlearn2code.restapi;

import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceAssembler;
import org.springframework.stereotype.Component;
import sk.jaroslavbeno.springlearn2code.model.dto.MovieDTO;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

@Component
public class MovieResourcesAssembler implements ResourceAssembler<MovieDTO, Resource<MovieDTO>> {
    @Override
    public Resource<MovieDTO> toResource(MovieDTO movieDTO) {
        return new Resource<>(movieDTO,
                linkTo(methodOn(MovieRestController.class)
                        .getMovieById(movieDTO.getId())).withSelfRel(),
                linkTo(methodOn(MovieRestController.class)
                        .getMovies("")).withRel("movies")
        );
    }
}
