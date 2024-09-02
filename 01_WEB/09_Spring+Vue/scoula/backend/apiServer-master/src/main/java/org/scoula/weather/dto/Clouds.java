package org.scoula.weather.dto;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonProperty;

public class Clouds{

	@JsonProperty("all")
	private int all;

	public int getAll(){
		return all;
	}
=======
import lombok.Data;

@Data
public class Clouds{
    private int all;
>>>>>>> 536511cbff80d178433e6f7c1f1c83848b20a14a
}