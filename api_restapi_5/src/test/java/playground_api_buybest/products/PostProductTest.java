package playground_api_buybest.products;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.Model.CreateProductPojo;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class PostProductTest extends TestBase{




    @Test
    public void CreateTheProductes() {
        CreateProductPojo createProductPojo = new CreateProductPojo();
        createProductPojo.setName("arti");
        createProductPojo.setType("string");
        createProductPojo.setPrice(0);
        createProductPojo.setShipping(0);
        createProductPojo.setUpc("string");
        createProductPojo.setDescription("string");
        createProductPojo.setManufacturer("string");
        createProductPojo.setModel("string");
        createProductPojo.setUrl("string");
        createProductPojo.setImage("string");


        Response response = given()
                 .header("Content-Type", "application/json")
                .body(createProductPojo)
                .when()
                .post("/products");
        response.then().statusCode(201);
        response.prettyPrint();


    }
}