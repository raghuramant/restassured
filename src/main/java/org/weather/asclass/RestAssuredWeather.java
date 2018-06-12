package org.weather.asclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredWeather {
@Test
public void weatherResponse(){
	//RequestSpecification request = RestAssured.with();
	//request.
	Response response = RestAssured.get("http://restapi.demoqa.com/utilities/weather/city/Chennai");
	//System.out.println(response.asString());
	Weather weather = response.as(Weather.class);
	Assert.assertEquals(weather.getCity(), "Chennai");
	System.out.println("City : " + weather.getCity());
	System.out.println("Temperature : "+ weather.getTemperature());
	System.out.println("Humidity : "+weather.getHumidity());
	System.out.println("Windspeed : "+weather.getWindSpeed());
	System.out.println("Winddirection Degree : " + weather.getWindDirectionDegree());
	
	
	
}
}
