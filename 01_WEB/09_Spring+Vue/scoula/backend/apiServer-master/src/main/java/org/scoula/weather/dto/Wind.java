package org.scoula.weather.dto;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind{

	@JsonProperty("deg")
	private int deg;

	@JsonProperty("speed")
	private double speed;

	public int getDeg(){
		return deg;
	}

	public double getSpeed(){
		return speed;
	}
=======
import lombok.Data;

@Data
public class Wind{
    private int deg;
    private double speed;
    private double gust;
>>>>>>> 536511cbff80d178433e6f7c1f1c83848b20a14a
}