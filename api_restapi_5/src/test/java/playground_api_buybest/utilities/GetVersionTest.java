package playground_api_buybest.utilities;

import io.restassured.response.Response;
import org.junit.Test;
import playground_api_buybest.testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetVersionTest extends TestBase {
    @Test
    public void getTheUtilitiesVersion(){



            Response response=given()
                    .when()
                    .get("/version");
            response.then().statusCode(200);
            response.prettyPrint();


        }
        @Test
        public void getTheHealthCheckup(){

            Response response=given()
                    .when()
                    .get("/healthcheck");
            response.then().statusCode(200);
            response.prettyPrint();


        }
    }

