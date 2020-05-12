package com.localhost.testsuite;

import com.localhost.pojo.Pojo;
import com.localhost.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

/*
 * Ravi's Creation
 * Date of Creation 11-05-2020
 */
public class PatchRequest extends TestBase {
    @Test
    public void updateEmailAddress(){

        Pojo pojo = new Pojo();
        pojo.setEmail("changeemail@yahoo.com");

        given()
                .log()
                .body()
                .header("Content-Type", "application/json")
                .when()
                .body(pojo)
                .patch("101")
                .then()
                .log()
                .body()
                .body("msg",equalTo("Updated"))
                .statusCode(200);
        }
    }

