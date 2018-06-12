package org.task.Rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class RestTest {

	@Test
	static void mytest() {
		Response myresp = RestAssured.get("http://restapi.demoqa.com/utilities/weather/city/Chennai");
		Assert.assertEquals(200, myresp.getStatusCode());
		Weather weatherob = myresp.as(Weather.class);
		System.out.println(weatherob.getCity());
		System.out.println(weatherob.getTemperature());
		Assert.assertEquals("Chennai", weatherob.getCity());
		Assert.assertNotNull(weatherob.getTemperature());
	}
}
