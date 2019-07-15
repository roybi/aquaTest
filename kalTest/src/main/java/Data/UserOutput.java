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
public class UserOutput {
    private double executionTime;
    private UserOutputResult result;
}
