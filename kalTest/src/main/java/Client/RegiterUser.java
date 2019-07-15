package Client;

import lombok.Data;

import Data.RegisterOtter;
import Data.UserOutput;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.springframework.http.HttpStatus;
import static io.restassured.RestAssured.given;

@Data
public class RegiterUser {

    public UserOutput setRegUser(RegisterOtter registerOtter) {
        String url = "https://rest-eus1.ott.kaltura.com/restful_v5_0/api_v3/service/ottuser/action/register";

        Response response =
                given().
                        contentType(ContentType.JSON).
                        body(registerOtter).
                        when().
                        post(url).
                        then().
                        assertThat().
                        statusCode(HttpStatus.OK.value()).
                        extract().
                        response();
        return response.body().as(UserOutput.class);
    }
}
