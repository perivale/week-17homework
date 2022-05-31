package playground_api_buybest.stores;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetStoreTest extends TestBase {

    @Test
    public void getThestoreslist(){

        Response response=given()
                .when()
                .get("/stores");
        response.then().statusCode(200);
        response.prettyPrint();


    }
    @Test
    public void getThestoresIdlist(){

        Response response=given()
                .pathParam("id",285267)
                .when()
                .get("/stores/{id}");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}

