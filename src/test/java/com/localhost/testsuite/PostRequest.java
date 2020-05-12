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
public class PostRequest extends TestBase {
    Pojo pojo = new Pojo();
@Test
    public void createStudentRecord(){

  //  Pojo pojo = new Pojo();

    List<String > course = new ArrayList<>();
    course.add("Postman");
    course.add("API Testing");
    pojo.setFirstName("Indrajeet");
    pojo.setLastName("dev");
    pojo.setEmail("indrajitdev@yahoo.com");
    pojo.setProgramme("Postman API");
    pojo.setCourse(course);

    given()
            .log()
            .body()
            .header("Content-Type", "application/json")
            .when()
            .body(pojo)
            .post()
            .then()
            .log()
            .body()
            .body("msg",equalTo("Student added"))
            .statusCode(201);

}
@Test
    public void createStudentRecordWithNullFirstName(){

    List<String > course = new ArrayList<>();
    course.add("Postman");
    course.add("API Testing");
    pojo.setFirstName(" ");
    pojo.setLastName("dev");
    pojo.setEmail("indrajitdev@yahoo.com");
    pojo.setProgramme("Postman API");
    pojo.setCourse(course);

    given()
            .log()
            .body()
            .header("Content-Type", "application/json")
            .when()
            .body(pojo)
            .post()
            .then()
            .log()
            .body()
            .body("msg",equalTo("Student added"))
            .statusCode(201);

}
}
