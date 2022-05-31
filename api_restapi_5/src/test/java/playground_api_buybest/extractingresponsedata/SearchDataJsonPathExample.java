package playground_api_buybest.extractingresponsedata;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class SearchDataJsonPathExample {
    static ValidatableResponse response;


    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
        response = given()
                .when()
                .get("/stores")
                .then().statusCode(200);


    }


    // 1.Extract the limit
    @Test
    public void test001() {
        int limit = response.extract().path("limit");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Extract the limit is : " + limit);
        System.out.println("------------------End of Test---------------------------");

    }

    // 2) Extract the total
    @Test
    public void test002() {
        int limit = response.extract().path("total");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of limit is : " + limit);
        System.out.println("------------------End of Test---------------------------");

    }
    //3 Extract the name of 5th store
    @Test
    public void test003() {
        String name = response.extract().path("data[5].name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The the name of 5th store : " + name);
        System.out.println("------------------End of Test---------------------------");

    }
    //4 Extract the names of all the store
    @Test
    public void test004() {
        List<Integer> listofallname=response.extract().path("data.name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Extract the names of all the store : " + listofallname);
        System.out.println("------------------End of Test---------------------------");

    }
    //5 Extract the storeId of all the store
    @Test
    public void test005() {
        List<HashMap<String,Integer>>   listofallstoreid=response.extract().path("data.findAll{it.services}services.findAll{it.storeservices}.storeservices.storeId");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Extract the storeId of all the store : " + listofallstoreid);
        System.out.println("------------------End of Test---------------------------");

    }
    //6.Print the size of the data list
    @Test
    public void test006() {
        List<Integer> listofdatasize=response.extract().path("data");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println(" Print the size of the data list :" + listofdatasize);
        System.out.println("------------------End of Test---------------------------");

    }
    //7] Get all the value of the store where store name = St Cloud
    @Test
    public void test007() {
       List<String >valueofstorename=response.extract().path("data.findAll{it.name=='St Cloud'}.name");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("  Get all the value of the store where store name = St Cloud :" + valueofstorename);
        System.out.println("------------------End of Test---------------------------");

    }
    //8]Get the address of the store where store name = Rochester
    @Test
    public void test008() {
        List<String >valueofstoreadd=response.extract().path("data.findAll{it.name=='Rochester'}.address");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("  Get the address of the store where store name = Rochester :" + valueofstoreadd);
        System.out.println("------------------End of Test---------------------------");

    }
    //9]Get all the services of 8th store
    @Test
    public void test009() {
        List<HashMap<String,?>>storeservice=response.extract().path("data[8].services");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println(" Get all the services of 8th store :" + storeservice);
        System.out.println("------------------End of Test---------------------------");

    }
    //10]Get storeservices of the store where service name = Windows Store
    @Test
    public void test010() {//data[8].services
        List<String> servicename=response.extract().path("data.findAll{it.service=='Windows Store'}.storeservices");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Get storeservices of the store where service name = Windows Store :" + servicename);
        System.out.println("------------------End of Test---------------------------");

    }
    //11]Get all the storeId of all the store
    @Test
    public void test011() {
        List<Object> storeid=response.extract().path("data.findAll{it.services}services.findAll{it.storeservices}.storeservices.storeId");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Get all the storeId of all the store :" + storeid);
        System.out.println("------------------End of Test---------------------------");

    }
    //12]Get id of all the store
    @Test
    public void test012() {
   List<Integer> store=response.extract().path("data.findAll{it.id}");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Get all the id of all the store :" +store );
        System.out.println("------------------End of Test---------------------------");

    }
    //13]Find the store names Where state = ND
    @Test
    public void test013() {
        List<Integer> name = response.extract().path("data.findAll{it.state=='ND'}.state");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Find the store names Where state = ND :" + name);
        System.out.println("------------------End of Test---------------------------");

    }
    //14]Find the Total number of services for the store where store name = Rochester
    @Test public void test014() {
        int numberOfServices = response.extract().path("data.findAll{it.name=='Rochester'}.find{it.services}.services.size()");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Find the Total number of services for the store where store name = Rochester :" + numberOfServices);
        System.out.println("------------------End of Test---------------------------");

    }
    //15]Find the createdAt for all services whose name = “Windows Store”
    @Test public void test015() {
        List<String> time = response.extract().
                path("data.findAll{it.services.find{it.name =='Windows Store'}}.createdAt");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Find the createdAt for all services whose name = “Windows Store”:" + time);
        System.out.println("------------------End of Test---------------------------");

    }
    //16]Find the name of all services Where store name = “Fargo
    @Test
    public void test016() {
        List<HashMap<String,?>>    nameOfServices = response.extract().path("data.findAll{it.name=='Fargo'}.services");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Find the name of all services Where store name = “Fargo:" + nameOfServices);
        System.out.println("------------------End of Test---------------------------");

    }
//17]Find the zip of all the store
    @Test
    public void test017() {
        List<String> zip = response.extract().path("data.findAll{it.zip}");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Find the zip of all the store:" + zip);
        System.out.println("------------------End of Test---------------------------");

    }
    //18]Find the zip of store name = Roseville
    @Test
    public void test018() {
        List<String> zipofstorename = response.extract().path("data.findAll{it.name='Roseville'}.zip");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Find the zip of store name = Roseville:" + zipofstorename);
        System.out.println("------------------End of Test---------------------------");

    }
    //19]Find the storeservices details of the service name = Magnolia Home Theater
    @Test
    public void test019() {
        List<Map<String,?>> storename = response.extract().path("data.findAll{it.services.find{it.name =='Magnolia Home Theater'}}.services.storeservices");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Find the storeservices details of the service name = Magnolia Home Theater:" + storename);
        System.out.println("------------------End of Test---------------------------");

    }
    //20]Find the lat of all the stores
    @Test
    public void test020() {
        List<Map<String,?>> storename = response.extract().path("data.findAll{it.name}.lat");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Find the lat of all the stores:" + storename);
        System.out.println("------------------End of Test---------------------------");

    }













}