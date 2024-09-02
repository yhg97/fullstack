package org.scoula.weather.dto;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonProperty;

public class Coord{

	@JsonProperty("lon")
	private double lon;

	@JsonProperty("lat")
	private double lat;

	public double getLon(){
		return lon;
	}

	public double getLat(){
		return lat;
	}
=======
import lombok.Data;

@Data
public class Coord{
    private double lon;
    private double lat;
>>>>>>> 536511cbff80d178433e6f7c1f1c83848b20a14a
}