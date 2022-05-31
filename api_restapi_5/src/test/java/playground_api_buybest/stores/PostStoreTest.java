package playground_api_buybest.stores;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;
import playground_api_buybest.Model.CreateStorePojo;
import playground_api_buybest.testbase.TestBase;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class PostStoreTest extends TestBase {



    @Test
    public void CreateTheProductes() {

        List<String> list=new ArrayList<>();
        list.add("updatedAt");
        list.add("creditAt");



        CreateStorePojo createStorePojo=new CreateStorePojo();

        createStorePojo.setName("string");
        createStorePojo.setType("string");
        createStorePojo.setAddress("string");
        createStorePojo.setAddress2("string");
        createStorePojo.setCity("string");
        createStorePojo.setState("string");
        createStorePojo.setZip("string");
        createStorePojo.setLat(0);
        createStorePojo.setLng(0);
        createStorePojo.setHours("string");
        createStorePojo.setService(list);


        Response response = given()
                .header("Content-Type", "application/json")
                .body(createStorePojo)
                .when()
                .post("/stores");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
