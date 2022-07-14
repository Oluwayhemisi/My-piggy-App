package africa.semicolon.my_piggyvest.services;

public interface AccountService {
    void createAccount(String firstName, String lastName, String pin );
    double deposit(double amount);
    double withdraw(double amount);


}
