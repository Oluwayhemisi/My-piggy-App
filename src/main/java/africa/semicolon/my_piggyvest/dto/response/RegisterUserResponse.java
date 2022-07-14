package africa.semicolon.my_piggyvest.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserResponse {


    private String email;
    private String dateCreated;
}
