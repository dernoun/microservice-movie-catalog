package dz.itbridge.movieinfoservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import dz.itbridge.movieinfoservice.models.Movie;
import dz.itbridge.movieinfoservice.models.MovieSummery;

@RestController
@RequestMapping("/movies")
public class MovieInfo {
	
	@Value(value = "${api.key}")
	private String apiKey;
	
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/{movieId}")
	public Movie getMovie(@PathVariable("movieId") String movieId) {
		MovieSummery movieSummery = restTemplate.getForObject("https://api.themoviedb.org/3/movie/"+movieId+"?api_key="+apiKey, MovieSummery.class);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Movie movie = new Movie(movieSummery.getTitle(), movieSummery.getOverview());
		return movie;
	}

}
