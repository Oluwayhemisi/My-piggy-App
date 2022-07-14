package africa.semicolon.my_piggyvest.services;


import africa.semicolon.my_piggyvest.data.models.Account;
import africa.semicolon.my_piggyvest.data.repositories.AccountRepository;
import africa.semicolon.my_piggyvest.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;


    @Override
   public void createAccount(String firstName, String lastName, String pin ){
        Account account = new Account(firstName,lastName,pin);
        accountRepository.save(account);
    }

    @Override
    public double deposit(double amount) {
        Account account = accountRepository.deposit(amount);
        account.setBalance(account.getBalance());
        return account.getBalance();
    }

    @Override
    public double withdraw(double amount) {
        return 0;
    }


}
