package playground_api_buybest.services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.Model.CreateSrvicesPojo;
import playground_api_buybest.Model.CreateStorePojo;
import playground_api_buybest.testbase.TestBase;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class patchSrvicesTest extends TestBase {



    @Test
    public void ChangeTheProductes() {
        CreateSrvicesPojo createSrvicesPojo=new CreateSrvicesPojo();
        createSrvicesPojo.setName("String");


        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 312290)
                .body(createSrvicesPojo)
                .when()
                .patch("/services/{id}");
        response.then().statusCode(400);
        response.prettyPrint();

    }
}
