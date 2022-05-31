package com.herokuapp.booker.restful.datainfo;

import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class DeleteIdDataTest extends TestBase {
    @Test
    public void deleteIdData(){
        Response response=given()
                .headers("Cookie","token=8c392218c919c23")
                .pathParam("id",939)
                .when()
                .delete("/booking/{id}");
        response.then().statusCode(201);
        response.prettyPrint();



    }
}
