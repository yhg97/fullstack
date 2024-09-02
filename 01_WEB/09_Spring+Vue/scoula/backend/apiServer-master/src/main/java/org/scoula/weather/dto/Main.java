package org.scoula.weather.dto;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonProperty;

public class Main{

	@JsonProperty("temp")
	private double temp;

	@JsonProperty("temp_min")
	private double tempMin;

	@JsonProperty("grnd_level")
	private int grndLevel;

	@JsonProperty("humidity")
	private int humidity;

	@JsonProperty("pressure")
	private int pressure;

	@JsonProperty("sea_level")
	private int seaLevel;

	@JsonProperty("feels_like")
	private double feelsLike;

	@JsonProperty("temp_max")
	private double tempMax;

	public double getTemp(){
		return temp;
	}

	public double getTempMin(){
		return tempMin;
	}

	public int getGrndLevel(){
		return grndLevel;
	}

	public int getHumidity(){
		return humidity;
	}

	public int getPressure(){
		return pressure;
	}

	public int getSeaLevel(){
		return seaLevel;
	}

	public double getFeelsLike(){
		return feelsLike;
	}

	public double getTempMax(){
		return tempMax;
	}
=======
import lombok.Data;

@Data
public class Main{
    private double temp;
    private double tempMin;
    private int grndLevel;
    private int humidity;
    private int pressure;
    private int seaLevel;
    private double feelsLike;
    private double tempMax;
>>>>>>> 536511cbff80d178433e6f7c1f1c83848b20a14a
}