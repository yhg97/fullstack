package org.scoula.weather.dto;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherItem{

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("description")
	private String description;

	@JsonProperty("main")
	private String main;

	@JsonProperty("id")
	private int id;

	public String getIcon(){
		return icon;
	}

	public String getDescription(){
		return description;
	}

	public String getMain(){
		return main;
	}

	public int getId(){
		return id;
	}
=======
import lombok.Data;

@Data
public class WeatherItem{
    private String icon;
    private String description;
    private String main;
    private int id;
>>>>>>> 536511cbff80d178433e6f7c1f1c83848b20a14a
}