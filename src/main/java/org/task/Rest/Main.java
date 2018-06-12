package org.task.Rest;

import org.testng.annotations.Test;

import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Main {
	@Test
	public void method() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET, "/Hyderabad");
		
		System.out.println( "adsf" + response.getBody().asString());
		// response code
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		// response status line
		String statusLine = response.getStatusLine();
		System.out.println("status line :" + statusLine);
		// headers
		String header1 = response.header("Content-Type");
		String header2 = response.header("Server");
		String header3 = response.header("Content-Encoding");
		Headers headers = response.getHeaders();
		for (Header header : headers) {
			System.out.println(header);
			System.out.println(header.getName());
			System.out.println(header.getValue());
		}

		// extract node text using jsonpath
		JsonPath jsonPath = response.jsonPath();
		String cityname = jsonPath.get("City");
		System.out.println("City name " + cityname);

	}

}
