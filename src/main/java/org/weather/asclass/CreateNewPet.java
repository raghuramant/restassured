package org.weather.asclass;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateNewPet {
	@Test
	public void newpetCreation() {

		Category cats = new Category();
		cats.setId(1);
		cats.setName("dog1");

		Tags tag1 = new Tags();
		tag1.setId(1);
		tag1.setName("dog1");

		List<Tags> taglist = new ArrayList<Tags>();
		taglist.add(tag1);
		// taglist.add(tag2);
		NewPetRoot newpet = new NewPetRoot();
		newpet.setId(1);
		newpet.setName("testdog1");
		newpet.setCategory(cats);
		newpet.setTags(taglist);
		newpet.setStatus("available");

		List<String> phturl = new ArrayList<>();
		phturl.add("llocation1");
		newpet.setPhotoUrls(phturl);
		RequestSpecification request = RestAssured.with();
		Response response = request.header("Content-Type", "application/json").body(newpet).post("http://petstore.swagger.io/v2/pet");
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println(response.getStatusCode());
		// Response response =
		// RestAssured.get("http://restapi.demoqa.com/utilities/weather/city/Chennai");
		NewPetRoot out = response.as(NewPetRoot.class);
		Assert.assertNotNull(out.getId());
		Assert.assertEquals(out.getId(), 1);

	}
}
