package responseAsJsonPath;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.task.Rest.Arraylistl;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class JsonPath {
	@Test
	public void method() {
		Response resp = RestAssured.given().get("http://petstore.swagger.io/v2/pet/1");
		//String str = (String) resp.jsonPath().get("id");
		//System.out.println(str);
		
		io.restassured.path.json.JsonPath jsonPath = resp.jsonPath();
		io.restassured.path.json.JsonPath jsonPathEvaluator = resp.jsonPath();
		
//		 List<String> list = jsonPath.getList("category");
//		  List<Object> list = jsonPathEvaluator.getList("category.name");
		Object jsonObject = jsonPathEvaluator.getJsonObject("$");
		String x = jsonPathEvaluator.getString("type");
		System.out.println(jsonObject);
		System.out.println(x);
		
		//System.out.println(list.size());
	}
	
	@Test
	public void method1() {
		Response resp = RestAssured.given().get("http://restapi.demoqa.com/utilities/books/getallbooks");
		String str = (String) resp.jsonPath().get("books[1].title");
		System.out.println(str);
		
		io.restassured.path.json.JsonPath jsonPath = resp.jsonPath();
		io.restassured.path.json.JsonPath jsonPathEvaluator = resp.jsonPath();
		
//		 List<String> list = jsonPath.getList("category");
//		  List<Object> list = jsonPathEvaluator.getList("category.name");
		Object jsonObject = jsonPathEvaluator.getJsonObject("$");
		String x = jsonPathEvaluator.getString("type");
		System.out.println(jsonObject);
		System.out.println(x);
		System.out.println(jsonPathEvaluator.getMap("$"));
		
		Map<Object, Object> map = jsonPathEvaluator.getMap("$");
		System.out.println(map.size());

		System.out.println(map.values());
		System.out.println(map.values().size());
		List<String> arr = new ArrayList<String>();
		
		
		//System.out.println(list.size());
	}

}
