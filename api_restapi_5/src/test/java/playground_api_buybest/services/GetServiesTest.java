package playground_api_buybest.services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetServiesTest extends TestBase {



    @Test
    public void getThestoreslist(){

        Response response=given()
                .when()
                .get("/services");
        response.then().statusCode(200);
        response.prettyPrint();


    }
    @Test
    public void getThestoresIdlist(){

        Response response=given()
                .pathParam("id",333179)
                .when()
                .get("/services/{id}");
        response.then().statusCode(404);
        response.prettyPrint();


    }

}
