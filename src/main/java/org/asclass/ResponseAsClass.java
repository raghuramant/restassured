package org.asclass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResponseAsClass {
@Test
public void method(){
	Response response = RestAssured.get("http://petstore.swagger.io/v2/pet/findByStatus?status=pending");
	System.out.println(response.asString());
}
}
