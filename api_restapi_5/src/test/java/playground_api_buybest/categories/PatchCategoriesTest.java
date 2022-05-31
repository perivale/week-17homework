package playground_api_buybest.categories;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.Model.CreatecategoriesPojo;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PatchCategoriesTest extends TestBase {



    @Test
    public void CreateThecategoriesTest() {
        CreatecategoriesPojo createcategoriesPojo=new CreatecategoriesPojo();
        createcategoriesPojo.setName("StrinG");
        createcategoriesPojo.setId("StrinG");




        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id",43900)
                .body(createcategoriesPojo)
                .when()
                .patch("/categories/{id}");
        response.then().statusCode(200);
        response.prettyPrint();



    }
}
