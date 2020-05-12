package com.localhost.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class TestBase {

    @BeforeClass
    public static void inIt(){

        RestAssured.baseURI = "http://localhost:8080";
        RestAssured.basePath = "/student";

    }
}
