package playground_api_buybest.products;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.Model.CreateProductPojo;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteProductTest extends TestBase{


    @Test
    public void DeleteTheProductes() {


        Response response = given()
                .pathParam("id", 150115)
                .when()
                .delete("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();


    }

}
