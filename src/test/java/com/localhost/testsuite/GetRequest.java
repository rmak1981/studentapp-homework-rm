package com.localhost.testsuite;

import com.localhost.pojo.Pojo;
import com.localhost.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

/*
 * Ravi's Creation
 * Date of Creation
 */
public class GetRequest extends TestBase {

  @Test
    public void getAllStudentList(){

      given()
              .log()
              .headers()
              .when()
              .get("/list")
              .then()
              .log().body()
              .body("id.size",equalTo(100))
              .statusCode(200);
}
@Test
  public void getStudentById(){
    given()

            .log()
            .headers()
            .when()
            .get("/5")
            .then()
            .log().body()
            .body("firstName",equalTo("Cullen"))
            .statusCode(200);
}
@Test
  public void getStudentByProgramme(){
    given()
            .log()
            .headers()
            .param("programme","Medicine")
            .when()
            .get("/list")
            .then()
            .log().body()
            .body("id.size",equalTo(18))
            .statusCode(200);

}
@Test
  public void getStudentByProgrammeLimit(){
    given()
            .log()
            .headers()
            .param("programme","Criminology")
            .param("limit","5")
            .when()
            .get("/list")
            .then()
            .log().body()
            .body("id.size",equalTo(5))
            .statusCode(200);
}
}
