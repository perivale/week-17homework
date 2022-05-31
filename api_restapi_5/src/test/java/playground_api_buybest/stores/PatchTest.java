package playground_api_buybest.stores;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.Model.CreateProductPojo;
import playground_api_buybest.Model.CreateStorePojo;
import playground_api_buybest.testbase.TestBase;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PatchTest extends TestBase {



    @Test
    public void ChangeTheProductes() {
        List<String> list=new ArrayList<>();
        list.add("updatedAt");
        list.add("creditAt");



        CreateStorePojo createStorePojo=new CreateStorePojo();

        createStorePojo.setName("String");
        createStorePojo.setType("String");
        createStorePojo.setAddress("String");
        createStorePojo.setAddress2("String");
        createStorePojo.setCity("String");
        createStorePojo.setState("String");
        createStorePojo.setZip("string");
        createStorePojo.setLat(0);
        createStorePojo.setLng(0);
        createStorePojo.setHours("string");
        createStorePojo.setService(list);



        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id", 312290)
                .body(createStorePojo)
                .when()
                .patch("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
    }
