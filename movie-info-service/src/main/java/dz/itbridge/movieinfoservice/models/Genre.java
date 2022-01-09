
package dz.itbridge.movieinfoservice.models;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Genre {

	private Integer id;
	private String name;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Genre() {
	}

	/**
	 *
	 * @param name
	 * @param id
	 */
	public Genre(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}