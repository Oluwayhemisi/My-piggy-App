package africa.semicolon.my_piggyvest.data.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor



public class Bank {
    @NonNull
    private String name;
    @NonNull
    private Account accounts;
    @NonNull
    private int numberOfUsers;
}
