import Data.*;
import Client.*;
import lombok.Data;
import org.junit.Test;

@Data
public class RegisterUserTest {
    @Test
    public void RegisterUser() {
        createObj();
    }

    public RegisterOtter createObj() {
        int ranNum = randomNum();

        UserOtt user = UserOtt.builder()
                .objectType("KalturaOTTUser" + ranNum)
                .username("randomUser" + ranNum)
                .firstName("fName" + ranNum)
                .lastName("lName" + ranNum)
                .email("randomMail" + ranNum + "@gmail.com")
                .address("fake address")
                .city("City")
                .countryId(7)
                .externalId(ranNum)
                .build();

        RegisterOtter regUser = new RegisterOtter();
        regUser.setUserOtt(user);
        regUser.setPassword("pass");
    }

    public int randomNum() {
        int rand = (int) (Math.random());
        return rand;
    }
}



