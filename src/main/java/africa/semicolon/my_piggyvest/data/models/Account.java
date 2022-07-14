package africa.semicolon.my_piggyvest.data.models;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Document("accounts")
public class Account{
    @NonNull
    private String accountNumber;
    @NonNull
    private String fullName;
    private double balance;
    @NonNull
    private String pin;
}
