package com.localhost.testsuite;

import com.localhost.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 * Ravi's Creation
 * Date of Creation 11-05-2020
 */
public class OptionsRequest extends TestBase {

    @Test
    public void checkOpitons(){
        given()
                .when()
                .options("/list")
                .then()
                .log()
                .headers()
                .statusCode(200);

    }
}
