package playground_api_buybest.stores;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteTest extends TestBase {

    @Test
    public void DeleteTheStroresIds() {


        Response response = given()
                .pathParam("id", 185230)
                .when()
                .delete("/stores/{id}");
        response.then().statusCode(201);
        response.prettyPrint();


    }

}
