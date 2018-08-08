import files.Resources;
import files.payLoad;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class BasicApiTest4
{
    Properties prop = new Properties();

    @BeforeTest
    public void getData() throws IOException {

        FileInputStream fis = new FileInputStream("C:\\_Dev\\Personal\\TestDemoAPI\\src\\main\\java\\files\\env.properties");
        prop.load(fis);
        //prop.get("HOST");
    }

    @Test
    public void AddandDeletePlace()
    {
        //Create a place  == response (place ID)


        // Task 1- Grab the Response
        //BaseURL =
        RestAssured.baseURI =  prop.getProperty("HOST");;

        // Send POST method with @QueryParamter
        //Add place in google maps


                Response res = given().
                queryParam("key",prop.getProperty("KEY")).
                body(payLoad.getPostData()).
                when().
                //Bring Resource from external file
                post(Resources.placePostData()).
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
                and().body("status",equalTo("OK")).
                //extract the all response that accept
                extract().response();

          // and delete place = (Requset -place ID)
        String  responseString =res.asString() ;
        System.out.println(responseString);
        // task 2 - Grab the place ID from the Response

        //Convert the raw format data in to JSON
        JsonPath jsText = new JsonPath(responseString);
        String placeIDData = jsText.get("place_id");
        System.out.println(placeIDData);

        //Task 3-  place this placeID in the delete Requsest
        String deleteBodyPath = "\n" +
                "{\n" +
                "  \"place_id\": \""+placeIDData+"\"\n" +
                "}\n" +
                "   ";

        given().
                queryParam("key","AIzaSyAjm25Qb4UY17X6scK4HNql4qyrB6Cj50k").
                body(deleteBodyPath).
                when().
                //Bring Resource from external file
                        post(Resources.placePostData()).
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
                and().body("status",equalTo("OK"));




    }


}
