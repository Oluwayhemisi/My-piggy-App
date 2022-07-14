package africa.semicolon.my_piggyvest.data.repositories;

import africa.semicolon.my_piggyvest.data.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AccountRepository extends MongoRepository<Account,String> {
    Account deposit (double amount);
}
