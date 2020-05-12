package com.localhost.testsuite;

import com.localhost.pojo.Pojo;
import com.localhost.testbase.TestBase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

/*
 * Ravi's Creation
 * Date of Creation 11-05-2020
 */
public class PutRequest extends TestBase {

    @Test
    public void updateStudentRecord(){

        List<String > courses = new ArrayList<>();
        courses.add("mohenjodaro");
        courses.add("hadappa");
        courses.add("unan");


        Pojo pojo = new Pojo();

        pojo.setFirstName("Indrajeet");
        pojo.setLastName("dev");
        pojo.setEmail("devraj@yahoo.com");
        pojo.setProgramme("Mythology");
        pojo.setCourse(courses);

        given()
                .log()
                .body()
                .header("Content-Type", "application/json")
                .when()
                .body(pojo)
                .put("101")
                .then()
                .log()
                .body()
                .body("msg",equalTo("Student updated"))
                .statusCode(200);

    }
}
