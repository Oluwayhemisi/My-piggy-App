package africa.semicolon.my_piggyvest.data.repositories;

import africa.semicolon.my_piggyvest.data.models.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankRepository extends MongoRepository<Account,String> {

}
