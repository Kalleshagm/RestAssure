package com.restAssure.basic;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RetrievingAllProjects {
	
	@Test
	void getAllProjects() {
	Response resp = RestAssured.get("http://localhost:8084/projects");
	//System.out.println(resp.asString());
	resp.prettyPrint();
	}
}
