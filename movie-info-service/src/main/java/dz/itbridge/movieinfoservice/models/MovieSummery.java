package dz.itbridge.movieinfoservice.models;

import java.util.List;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class MovieSummery {

	private Boolean adult;
	private String backdropPath;
	private Object belongsToCollection;
	private Integer budget;
	private List<Genre> genres = null;
	private String homepage;
	private Integer id;
	private String imdbId;
	private String originalLanguage;
	private String originalTitle;
	private String overview;
	private Double popularity;
	private String posterPath;
	private List<ProductionCompany> productionCompanies = null;
	private List<ProductionCountry> productionCountries = null;
	private String releaseDate;
	private Integer revenue;
	private Integer runtime;
	private List<SpokenLanguage> spokenLanguages = null;
	private String status;
	private String tagline;
	private String title;
	private Boolean video;
	private Double voteAverage;
	private Integer voteCount;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public MovieSummery() {
	}

	/**
	 *
	 * @param imdbId
	 * @param video
	 * @param title
	 * @param productionCountries
	 * @param revenue
	 * @param genres
	 * @param popularity
	 * @param id
	 * @param budget
	 * @param posterPath
	 * @param overview
	 * @param voteAverage
	 * @param releaseDate
	 * @param belongsToCollection
	 * @param runtime
	 * @param originalLanguage
	 * @param originalTitle
	 * @param tagline
	 * @param spokenLanguages
	 * @param backdropPath
	 * @param voteCount
	 * @param adult
	 * @param productionCompanies
	 * @param homepage
	 * @param status
	 */
	public MovieSummery(Boolean adult, String backdropPath, Object belongsToCollection, Integer budget,
			List<Genre> genres, String homepage, Integer id, String imdbId, String originalLanguage,
			String originalTitle, String overview, Double popularity, String posterPath,
			List<ProductionCompany> productionCompanies, List<ProductionCountry> productionCountries,
			String releaseDate, Integer revenue, Integer runtime, List<SpokenLanguage> spokenLanguages, String status,
			String tagline, String title, Boolean video, Double voteAverage, Integer voteCount) {
		super();
		this.adult = adult;
		this.backdropPath = backdropPath;
		this.belongsToCollection = belongsToCollection;
		this.budget = budget;
		this.genres = genres;
		this.homepage = homepage;
		this.id = id;
		this.imdbId = imdbId;
		this.originalLanguage = originalLanguage;
		this.originalTitle = originalTitle;
		this.overview = overview;
		this.popularity = popularity;
		this.posterPath = posterPath;
		this.productionCompanies = productionCompanies;
		this.productionCountries = productionCountries;
		this.releaseDate = releaseDate;
		this.revenue = revenue;
		this.runtime = runtime;
		this.spokenLanguages = spokenLanguages;
		this.status = status;
		this.tagline = tagline;
		this.title = title;
		this.video = video;
		this.voteAverage = voteAverage;
		this.voteCount = voteCount;
	}

	public Boolean getAdult() {
		return adult;
	}

	public void setAdult(Boolean adult) {
		this.adult = adult;
	}

	public String getBackdropPath() {
		return backdropPath;
	}

	public void setBackdropPath(String backdropPath) {
		this.backdropPath = backdropPath;
	}

	public Object getBelongsToCollection() {
		return belongsToCollection;
	}

	public void setBelongsToCollection(Object belongsToCollection) {
		this.belongsToCollection = belongsToCollection;
	}

	public Integer getBudget() {
		return budget;
	}

	public void setBudget(Integer budget) {
		this.budget = budget;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImdbId() {
		return imdbId;
	}

	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public Double getPopularity() {
		return popularity;
	}

	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}

	public String getPosterPath() {
		return posterPath;
	}

	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	public List<ProductionCompany> getProductionCompanies() {
		return productionCompanies;
	}

	public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
		this.productionCompanies = productionCompanies;
	}

	public List<ProductionCountry> getProductionCountries() {
		return productionCountries;
	}

	public void setProductionCountries(List<ProductionCountry> productionCountries) {
		this.productionCountries = productionCountries;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Integer getRevenue() {
		return revenue;
	}

	public void setRevenue(Integer revenue) {
		this.revenue = revenue;
	}

	public Integer getRuntime() {
		return runtime;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	public List<SpokenLanguage> getSpokenLanguages() {
		return spokenLanguages;
	}

	public void setSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
		this.spokenLanguages = spokenLanguages;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getVideo() {
		return video;
	}

	public void setVideo(Boolean video) {
		this.video = video;
	}

	public Double getVoteAverage() {
		return voteAverage;
	}

	public void setVoteAverage(Double voteAverage) {
		this.voteAverage = voteAverage;
	}

	public Integer getVoteCount() {
		return voteCount;
	}

	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}

}
