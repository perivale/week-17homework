package com.herokuapp.booker.restful.extractingresponsedata;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class SearchJsonPathExample {

    static ValidatableResponse response;


    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI="https://restful-booker.herokuapp.com/";
        response= given()
                .when()
                .get("/booking")
                .then().statusCode(200);


    }
    @Test
    public void test001() {


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("verify status  OK::"+response.extract().statusCode());
        System.out.println("verify code is::"+response.extract().time());
        System.out.println("verify Responce time is::"+response.extract().statusLine());
        System.out.println("------------------End of Test---------------------------");
    }



}
