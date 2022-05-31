package com.herokuapp.booker.restful.datainfo;

import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetIdDataTest extends TestBase {

    @Test
    public void getAllTheData() {

        Response response=given()
                .headers("Connection","keep-alive")
                .pathParam("id",1287)
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    }
