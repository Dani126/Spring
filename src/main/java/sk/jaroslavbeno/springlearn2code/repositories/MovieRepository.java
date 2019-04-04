package sk.jaroslavbeno.springlearn2code.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sk.jaroslavbeno.springlearn2code.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
