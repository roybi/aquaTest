import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BasicApiTest
{
   // public static void main (String[]args)
  @Test
    public void Test() {
      //BaseURL =
      RestAssured.baseURI = "https://maps.googleapis.com";

      //Recourse
      given(). // on Given you need to provide - Requset headers, paramters & requset cookies
              param("location", "-33.8670522,151.1957362").
              param("radius", "150").
              param("key", "AIzaSyAjm25Qb4UY17X6scK4HNql4qyrB6Cj50k").
              when().
              get("/maps/api/place/nearbysearch/json").
              then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and(). // add assertions
              // body("results[0].geometry.location.lat",equalTo("-33.8688197")); //validate that the object value is equal to the value
              //  body("results[0].name",equalTo("Sydney"));
                      body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM"));
      // header("dfd","sssss").
      // cookie("dddd","dddd").
      //  body( )*/
  }
        @Test
        public void Test2()
        {

            //BaseURL =
            RestAssured.baseURI = "https://maps.googleapis.com";

            //Recourse
            given(). // on Given you need to provide - Requset headers, paramters & requset cookies
                    param("location", "-33.8670522,151.1957362").
                    param("radius", "150").
                    param("key", "AIzaSyAjm25Qb4UY17X6scK4HNql4qyrB6Cj50k").
                    when().
                    get("/maps/api/place/nearbysearch/json").
                    then().assertThat().statusCode(200).and().contentType(ContentType.JSON).and(). // add assertions
                    body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).
                     and().header("Server","scaffolding on HTTPServer2");
        }

    }


