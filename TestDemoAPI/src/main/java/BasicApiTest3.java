import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import io.restassured.response.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class BasicApiTest3
{
    @Test
    public void AddandDeletePlace()
    {
        //Create a place  == response (place ID)

        String bodyPath = "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -33.8669710,\n" +
                "    \"lng\": 151.1958750\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"Google Shoes!\",\n" +
                "  \"phone_number\": \"(02) 9374 4000\",\n" +
                "  \"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\",\n" +
                "  \"types\": [\"shoe_store\"],\n" +
                "  \"website\": \"http://www.google.com.au/\",\n" +
                "  \"language\": \"en-AU\"\n" +
                "}";
        // Task 1- Grab the Response
        //BaseURL =
        RestAssured.baseURI = "https://maps.googleapis.com";

        // Send POST method with @QueryParamter
        //Add place in google maps


                Response res = given().
                queryParam("key","AIzaSyAjm25Qb4UY17X6scK4HNql4qyrB6Cj50k").
                body(bodyPath).
                when().
                post("maps/api/place/add/json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
                and().body("status",equalTo("OK")).
                //extract the all response that accept
                extract().response();

        String  responseString =res.asString() ;
        System.out.println(responseString);


          // and delete place = (Requset -place ID)

        // task - Grab the place ID from the Response

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
                when().post("maps/api/place/delete/json").
                then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
                and().body("status",equalTo("OK"));




    }


}
