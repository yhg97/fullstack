package org.scoula.weather.dto;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonProperty;

public class Sys{

	@JsonProperty("country")
	private String country;

	@JsonProperty("sunrise")
	private int sunrise;

	@JsonProperty("sunset")
	private int sunset;

	@JsonProperty("id")
	private int id;

	@JsonProperty("type")
	private int type;

	public String getCountry(){
		return country;
	}

	public int getSunrise(){
		return sunrise;
	}

	public int getSunset(){
		return sunset;
	}

	public int getId(){
		return id;
	}

	public int getType(){
		return type;
	}
=======
import lombok.Data;

@Data
public class Sys{
    private String country;
    private int sunrise;
    private int sunset;
    private int id;
    private int type;
>>>>>>> 536511cbff80d178433e6f7c1f1c83848b20a14a
}