package playground_api_buybest.categories;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.Model.CreateSrvicesPojo;
import playground_api_buybest.Model.CreatecategoriesPojo;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class CreateCategoriesTest extends TestBase {


    @Test
    public void CreatestoreProductes() {
        CreatecategoriesPojo createcategoriesPojo=new CreatecategoriesPojo();
        createcategoriesPojo.setName("string");
        createcategoriesPojo.setId("string");

        Response response = given()

                .body(createcategoriesPojo)
                .when()
                .post("/categories");
        response.then().statusCode(400);
        response.prettyPrint();
    }


}
