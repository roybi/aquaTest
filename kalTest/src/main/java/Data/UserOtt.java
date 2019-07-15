package Data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserOtt {
    private String objectType;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private int countryId;
    private int externalId;
}
