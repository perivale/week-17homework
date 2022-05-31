package com.herokuapp.booker.restful.datainfo;

import com.herokuapp.booker.restful.Model.Userpojo;
import com.herokuapp.booker.restful.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class CreateNewDataTest extends TestBase {

    @Test
    public void createData(){

        List<String>booking=new ArrayList<>();
        booking.add("2018-01-01");
        booking.add("2019-01-01");

        Userpojo userpojo=new Userpojo();
        userpojo.setFirstname("ekta");
        userpojo.setLastname("trivedi");
        userpojo.setTotalprice(111);
        userpojo.setDepositpaid(true);
        userpojo.setBookingdates(booking);
        userpojo.setAdditionalneeds("Breakfast");

        Response response = given()
              //  .header("Content-Type", "application/json")
                .headers("Cookie","token=8c392218c919c23")
                .body(userpojo)
                .when()
                .post("/booking");
        response.then().statusCode(200);
        response.prettyPrint();



    }

}
