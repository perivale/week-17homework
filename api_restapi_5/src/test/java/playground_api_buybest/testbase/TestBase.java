package playground_api_buybest.testbase;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;

/**
 * Created by Jay Vaghani
 */
public class TestBase {
    static ValidatableResponse response;


    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost/";
        RestAssured.port = 3030;


    }




}
