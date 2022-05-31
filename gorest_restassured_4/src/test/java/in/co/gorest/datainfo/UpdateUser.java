package in.co.gorest.datainfo;

import in.co.gorest.Model.UserPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UpdateUser extends TestBase {

    @Test
    public void updateUserData(){
        UserPojo userPojo=new UserPojo();
        userPojo.setName("ruhi");
        userPojo.setEmail("ruhi123@gmail.com");
        userPojo.setStatus("active");

        Response response = given()
                .header("Authorization","c2c439b1f8975b3c79f8e3feb261f3f2cccd0f60d3abe5ca44f25fc8e4304c05")
                .pathParam("id",3231)
                .body(userPojo)
                .when()
                .patch("/users{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
