package com.herokuapp.booker.restful.datainfo;

import com.herokuapp.booker.restful.Model.BookingPojo;
import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class GetAllTheDataTest extends TestBase {



    @Test
    public void getAllTheData() {

        BookingPojo bookingPojo=new BookingPojo();
        bookingPojo.setUsername("admin");
        bookingPojo.setPassword("password123");


        Response response=given()
                .headers("Connection","keep-alive")
                .body(bookingPojo)
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();


    }


}