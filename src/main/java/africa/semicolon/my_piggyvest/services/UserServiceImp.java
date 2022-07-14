package africa.semicolon.my_piggyvest.services;


import africa.semicolon.my_piggyvest.data.models.User;
import africa.semicolon.my_piggyvest.data.repositories.UserRepository;
import africa.semicolon.my_piggyvest.dto.request.LoginUserRequest;
import africa.semicolon.my_piggyvest.dto.request.RegisterUserRequest;
import africa.semicolon.my_piggyvest.dto.response.LoginUserResponse;
import africa.semicolon.my_piggyvest.dto.response.RegisterUserResponse;
import africa.semicolon.my_piggyvest.exceptions.LogInException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepository userRepository;
    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest request) {
        User user = new User();
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPin(request.getPin());

        User savedUser = userRepository.save(user);
        RegisterUserResponse response = new RegisterUserResponse();
        response.setEmail(savedUser.getEmail());
        response.setDateCreated(DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy, hh:mm,a ").format(savedUser.getDateRegistered()));
        return response;
    }

    @Override
    public LoginUserResponse loginUser(LoginUserRequest request) {
        LoginUserResponse response = new LoginUserResponse();
    User user = userRepository.findByEmail(request.getEmail()).orElseThrow(()-> new LogInException("User" +request.getEmail()+" be found"));
    if(Objects.equals(request.getPin(),user.getPin())){
        response.setMessage("Welcome back "+ response.getFirstName() +"!!!");
        response.setDateCreated(DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy, hh:mm,a").format(user.getDateRegistered()));
    }
    else{
        response.setMessage("Incorrect password");
    }

        return response;
    }
}
