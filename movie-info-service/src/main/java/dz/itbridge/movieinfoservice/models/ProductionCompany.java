package dz.itbridge.movieinfoservice.models;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class ProductionCompany {

	private Integer id;
	private String logoPath;
	private String name;
	private String originCountry;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public ProductionCompany() {
	}

	/**
	 *
	 * @param logoPath
	 * @param name
	 * @param originCountry
	 * @param id
	 */
	public ProductionCompany(Integer id, String logoPath, String name, String originCountry) {
		super();
		this.id = id;
		this.logoPath = logoPath;
		this.name = name;
		this.originCountry = originCountry;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogoPath() {
		return logoPath;
	}

	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

}