package in.co.gorest.extractingresponsedata;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;
import java.util.Locale;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.registerParser;

/*
 *  Created by Jay
 */
public class SearchJsonPathExample {

    static ValidatableResponse response;


    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://gorest.co.in/";
        RestAssured.basePath="public/v2";
        response = given()
                .when()
                .get("/users")
                .then().statusCode(200);


    }

    //Total records are 20
    @Test
    public void test001() {
        List<Integer> totalrecord = response.extract().path("data.findAll{it.id==20}");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("verify total record  20::" + totalrecord);
        System.out.println("------------------End of Test---------------------------");
    }
    //id 3855 has name = "Sanka Agarwal VM"
    @Test
    public void test002(){
      List<String> name=response.extract().path("data.findAll{it.id==3855}.Sanka Agarwal VM");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("verify id 3855 has name=Sanka Agarwal VM::" + name);
        System.out.println("------------------End of Test---------------------------");
    }
    //.to verify id 3855 has email =agarwal_vm_sanka@murray.net
    @Test
    public void test003(){
        List<String >email=response.extract().path("data.findAll{it.id==3232}.achari_sweta@cruickshank-bauch.biz");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("verify id 3855 has email::" + email);
        System.out.println("------------------End of Test---------------------------");
    }
    //]All ID has status = active
    @Test
    public void test004(){
        List<String >status=response.extract().path("");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("verify id has status active::" + status);
        System.out.println("------------------End of Test---------------------------");
    }
    //.id 2877 has gender = female
    @Test
    public void test005(){
        List<String >gender=response.extract().path("jsonData[1].id==2877");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("verify id 2877 is gender female::" + gender);
        System.out.println("------------------End of Test---------------------------");
    }
    //id 3853 has gender =male
    @Test
    public void test006(){
        List<String >gendermale=response.extract().path("jsonData[3].id==3853");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("verify id 3853 is gender male::" + gendermale);
        System.out.println("------------------End of Test---------------------------");
    }


    }









