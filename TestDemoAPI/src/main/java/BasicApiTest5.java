import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;

public class BasicApiTest5
{
    @Test
    public void test3() throws IOException {
     String postData= GenerateStringFormResource("C:\\Users\\royb\\Desktop\\postData.xml");

        //BaseURL =
        RestAssured.baseURI  =RestAssured.baseURI = "https://maps.googleapis.com";

        // Send POST method with @QueryParamter
        //Add place in google maps
       Response resp = given().
                queryParam("key","AIzaSyAjm25Qb4UY17X6scK4HNql4qyrB6Cj50k").
                // Body will use GenerateStringFormResource method
                body(postData).
                when().
                post("maps/api/place/add/xml").
                then().assertThat().statusCode(200).and().contentType(ContentType.XML).
                extract().response();

               String respon= resp.asString();
                System.out.println(respon);

        /*
                and().body("status",equalTo("OK"));
*/
        //Create a place  == response (place ID)


          // and delete place = (Requset -place ID)



    }

    public static String GenerateStringFormResource (String path) throws IOException
    {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

}
