package com.localhost.testsuite;

import com.localhost.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

/*
 * Ravi's Creation
 * Date of Creation 11-05-2020
 */
public class DeleteRequest extends TestBase {

    @Test
    public void deleteRecord() {

        given()
                .log()
                .uri()
                .when()
                .delete("/104")
                .then().statusCode(204);
    }
}
