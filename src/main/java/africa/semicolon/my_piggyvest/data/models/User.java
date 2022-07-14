package africa.semicolon.my_piggyvest.data.models;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document("users")
public class User {

    @Id
    private String accountNumber;
    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private String email;
    @NonNull
    private String pin;
    private double balance;
    LocalDateTime dateRegistered = LocalDateTime.now();
}
