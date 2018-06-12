package org.task.Rest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createJsonObject();
	}

	static void createJsonObject() {

		JSONObject myjson = new JSONObject();
		myjson.put("Name", "Greens");
		myjson.put("Location", "OMR");
		// System.out.println(myjson);

		JSONArray myjsonarray = new JSONArray();
		myjsonarray.add("1");
		myjsonarray.add("2");
		myjsonarray.add("3");

		// System.out.println(myjsonarray);

		JSONObject myjsonComp = new JSONObject();

		myjsonComp.put("city", "Chennai");
		myjsonComp.put("State", "TN");
		myjsonComp.put("data", myjsonarray);
		System.out.println(myjsonComp.get("city"));

	}
}
