package org.put.petstore;

import java.util.ArrayList;
import java.util.List;

import org.task.Rest.Arraylistl;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PetStorePut {
	@Test
	public void method() {
		Response put = RestAssured.put("http://petstore.swagger.io/v2/pet");

		PetClass petClass = new PetClass();
		
		petClass.setId(1);
		petClass.setName("lotto");
		petClass.setStatus("Available");
		Category category = new Category();
		category.setName("catgname");
		category.setId(1);

		petClass.setCategory(category);
		List<String> photoUrls = new ArrayList<>();
		photoUrls.add("photourl");
		petClass.setPhotoUrls(photoUrls);
		List<Tags> tags = new ArrayList<>();

		Tags tags1 = new Tags();
		tags1.setId(2);
		tags1.setName("tagname");
		tags.add(tags1);
		petClass.setTags(tags);
		// System.out.println(put.asString());
		PetClass as = put.as(PetClass.class);
		System.out.println(as.getName());
		

	}
}
