package org.task.Rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AsClass {
@Test
public void method(){
Response response = RestAssured.get("http://petstore.swagger.io/v2/pet/findByStatus?status=pending");
String asString = response.asString();
System.out.println(asString);


}

}
