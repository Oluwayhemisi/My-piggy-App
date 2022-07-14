package africa.semicolon.my_piggyvest.dto.request;


import lombok.Data;

@Data
public class LoginUserRequest {
    private String email;
    private String pin;
}
