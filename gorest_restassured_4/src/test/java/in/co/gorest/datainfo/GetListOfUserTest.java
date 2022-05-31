package in.co.gorest.datainfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetListOfUserTest extends TestBase {

    @Test
    public void getAllListofUser() {

        Response response = given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
