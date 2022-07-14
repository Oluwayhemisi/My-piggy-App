package africa.semicolon.my_piggyvest.data.repositories;

import africa.semicolon.my_piggyvest.data.models.Account;
import africa.semicolon.my_piggyvest.data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByEmail(String email);

}
