package review.travel.payload;

import lombok.Data;

@Data
public class SignupRequest {
    private String username;
    private String password;
}
