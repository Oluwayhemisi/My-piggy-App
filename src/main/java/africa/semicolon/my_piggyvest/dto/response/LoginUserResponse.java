package africa.semicolon.my_piggyvest.dto.response;


import lombok.Data;

@Data
public class LoginUserResponse {
    private String message;
    private String firstName;
    private String dateCreated;
}
