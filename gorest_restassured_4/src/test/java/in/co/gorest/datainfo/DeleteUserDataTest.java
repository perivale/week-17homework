package in.co.gorest.datainfo;

import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteUserDataTest extends TestBase {
    @Test
    public void deleteUserData(){

        Response response = given()
                .header("Authorization","c2c439b1f8975b3c79f8e3feb261f3f2cccd0f60d3abe5ca44f25fc8e4304c05")
                .pathParam("id",3232)
                .when()
                .delete("/users{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
