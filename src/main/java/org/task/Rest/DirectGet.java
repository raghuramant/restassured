package org.task.Rest;

import org.json.simple.JSONArray;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class DirectGet {
	@Test
	public void getRequestFindCapital() throws Throwable {
		
		//make get request to fetch capital of norway
		Response resp = RestAssured.given().get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad");
		
//		JsonPath jsonPath = resp.jsonPath();
//		System.out.println(jsonPath);
		ResponseBody body = resp.getBody();
		String asString = resp.getBody().asString();
		System.out.println(body.asString());
		
		JsonParser parse = new JsonParser();
		JsonObject json1 = (JsonObject)parse.parse(body.asString());
		
		JsonArray asJsonArray = parse.parse(body.asString()).getAsJsonArray();
		
		
		System.out.println(json1);
		
		
		System.out.println(json1.get("City"));
		
		System.out.println(asJsonArray);
		
		
		JsonArray array = new JsonArray();
		
		
//		JsonArray asJsonArray = json1.getAsJsonArray();
//		System.out.println("Json array"+asJsonArray);
		
		//Fetching response in JSON
		JSONArray jsonResponse = new JSONArray();
		
		
		
		JsonObject json = new JsonObject();
		
		
		System.out.println(body);/*
		
		//Fetching value of capital parameter
		String capital = jsonResponse.getJSONObject(0).getString("capital");
		
		//Asserting that capital of Norway is Oslo
		Assert.assertEquals(capital, "Oslo");*/
	}
}
