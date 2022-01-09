package dz.itbridge.movieinfoservice.models;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class SpokenLanguage {

private String englishName;
private String iso6391;
private String name;

/**
* No args constructor for use in serialization
*
*/
public SpokenLanguage() {
}

/**
*
* @param englishName
* @param name
* @param iso6391
*/
public SpokenLanguage(String englishName, String iso6391, String name) {
super();
this.englishName = englishName;
this.iso6391 = iso6391;
this.name = name;
}

public String getEnglishName() {
return englishName;
}

public void setEnglishName(String englishName) {
this.englishName = englishName;
}

public String getIso6391() {
return iso6391;
}

public void setIso6391(String iso6391) {
this.iso6391 = iso6391;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

}