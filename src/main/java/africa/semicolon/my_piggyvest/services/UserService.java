package africa.semicolon.my_piggyvest.services;

import africa.semicolon.my_piggyvest.dto.request.LoginUserRequest;
import africa.semicolon.my_piggyvest.dto.request.RegisterUserRequest;
import africa.semicolon.my_piggyvest.dto.response.LoginUserResponse;
import africa.semicolon.my_piggyvest.dto.response.RegisterUserResponse;

public interface UserService {
    RegisterUserResponse registerUser(RegisterUserRequest request);

    LoginUserResponse loginUser(LoginUserRequest request);
}
