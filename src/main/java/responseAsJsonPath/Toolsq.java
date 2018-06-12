package responseAsJsonPath;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Toolsq {
@Test
public void mthd(){
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/books/getallbooks";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.get("");
 
	// First get the JsonPath object instance from the Response interface
	io.restassured.path.json.JsonPath jsonPathEvaluator = response.jsonPath();
 
	// Read all the books as a List of String. Each item in the list
	// represent a book node in the REST service Response
//	List<String> allBooks = jsonPathEvaluator.getList("books.title");
 
	// Iterate over the list and print individual book item
	/*for(String book : allBooks)
	{
		System.out.println("Book: " + book);
	}*/
}
}

