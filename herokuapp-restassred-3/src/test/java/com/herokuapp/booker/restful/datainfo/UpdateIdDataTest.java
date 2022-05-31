package com.herokuapp.booker.restful.datainfo;

import com.herokuapp.booker.restful.Model.BookingPojo;
import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateIdDataTest extends TestBase {

    @Test
    public void upateIdData(){
        BookingPojo bookingPojo=new BookingPojo();
        bookingPojo.setUsername("Jame");
        bookingPojo.setPassword("Brown");

        Response response=given()
                .headers("Cookie","token=8c392218c919c23")
                .body(bookingPojo)
                .pathParam("id",1406)
                .when()
                .patch("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

    }

