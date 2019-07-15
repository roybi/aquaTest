package Data;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserOutputResult {
    private String objectType;
    private String firstName;
    private String first_name;
    private int id;
    private String lastName;
    private String last_name;
    private String username;
    private String address;
    private String city;
    private UserOutputResultCountry userOutputResultCountry;
    private UserOutputError error;
    private int countryId;
    private Instant createDate;
    private String dynamicData;
    private String dynamic_data;
    private int email;
    private int externalId;
    private int external_id;
    private int householdId;
    private int household_id;
    private boolean isHouseholdMaster;
    private boolean is_household_master;
    private int roleIds;
    private String suspensionState;
    private String suspentionState;
    private String suspention_state;
    private Instant updateDate;
    private String userState;
    private String user_state;
    private UserType userType;
    private User_type user_type;
}