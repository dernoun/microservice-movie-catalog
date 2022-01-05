package dz.itbridge.movieinfoservice.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dz.itbridge.movieinfoservice.models.Movie;

@RestController
@RequestMapping("/movies")
public class MovieInfo {

	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String mouvieId) {
		return new Movie("Transporter", "Description of the movie");
	}

}
