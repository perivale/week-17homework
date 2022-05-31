package playground_api_buybest.services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteServiesTest extends TestBase {


    @Test
    public void DeleteTheStroresIds() {


        Response response = given()
                .pathParam("id", 127687)
                .when()
                .delete("/services/{id}");
        response.then().statusCode(204);
        response.prettyPrint();

    }
    }
