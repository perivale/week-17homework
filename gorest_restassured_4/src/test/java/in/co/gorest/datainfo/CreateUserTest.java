package in.co.gorest.datainfo;

import in.co.gorest.Model.UserPojo;
import in.co.gorest.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateUserTest extends TestBase {

    @Test
    public void createUser(){

        UserPojo userPojo=new UserPojo();
        userPojo.setName("Radhika Ramakrishna");
        userPojo.setGender("female");
        userPojo.setEmail("tenali.ramakrishna16@gmail.com");
        userPojo.setStatus("active");

        Response response=given()
                .headers("Authorization","c2c439b1f8975b3c79f8e3feb261f3f2cccd0f60d3abe5ca44f25fc8e4304c05")
                .body(userPojo)
                .when()
                .post("/users");
           response.then().statusCode(200);
           response.prettyPrint();
    }
}
