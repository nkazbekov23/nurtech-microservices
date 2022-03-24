package kg.nurtechnologies.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterCustomerRequest {

    private String firstName;
    private String lastName;
    private String email;

}
