package playground_api_buybest.categories;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetCategoriesTest extends TestBase {


    @Test
    public void getTheCategorieslist(){

        Response response=given()
                .when()
                .get("/categories");
        response.then().statusCode(200);
        response.prettyPrint();


    }
    @Test
    public void getThecategorisIdlist(){

        Response response=given()
                .pathParam("id", 127687)
                .when()
                .get("/categories/{id}");
        response.then().statusCode(404);
        response.prettyPrint();


    }

}
