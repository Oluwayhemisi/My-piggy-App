package africa.semicolon.my_piggyvest.dto.request;


import lombok.Data;

@Data
public class RegisterUserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String pin;
}
