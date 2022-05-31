package playground_api_buybest.products;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetProductTest extends TestBase {



        @Test
    public void getTheProductes(){

            Response response=given()
                    .when()
                    .get("/products");
            response.then().statusCode(200);
            response.prettyPrint();


        }
}
