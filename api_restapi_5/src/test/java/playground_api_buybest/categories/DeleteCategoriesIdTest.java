package playground_api_buybest.categories;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteCategoriesIdTest extends TestBase {


    @Test
    public void DeleteThecategoriesId() {


        Response response = given()
                .pathParam("id", 127687)
                .when()
                .delete("/categories/{id}");
        response.then().statusCode(204);
        response.prettyPrint();

    }
}
