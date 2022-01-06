package dz.itbridge.moviecatalogservice.models;

public class Movie {

	private String movieId;
	private String name;

	public Movie() {
	}

	public Movie(String name, String desc) {
		this.name = name;
		this.movieId = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return movieId;
	}

	public void setDesc(String desc) {
		this.movieId = desc;
	}

}
