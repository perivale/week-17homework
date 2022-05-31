package playground_api_buybest.services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.Model.CreateSrvicesPojo;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PostServicesTest extends TestBase {


    @Test
    public void CreatestoreProductes() {
        CreateSrvicesPojo createSrvicesPojo=new CreateSrvicesPojo();
        createSrvicesPojo.setName("string");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(createSrvicesPojo)
                .when()
                .post("/services");
        response.then().statusCode(201);
        response.prettyPrint();
    }


}
