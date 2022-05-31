package playground_api_buybest.products;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetProductIdTest extends TestBase {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost/";
        RestAssured.port=3030;


    }

    @Test
    public void getTheProductes(){

        Response response=given()
                .pathParam("id","48530")
                .when()
                .get("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}
