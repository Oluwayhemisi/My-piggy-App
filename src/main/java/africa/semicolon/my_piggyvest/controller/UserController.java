package africa.semicolon.my_piggyvest.controller;


import africa.semicolon.my_piggyvest.dto.request.LoginUserRequest;
import africa.semicolon.my_piggyvest.dto.request.RegisterUserRequest;
import africa.semicolon.my_piggyvest.dto.response.LoginUserResponse;
import africa.semicolon.my_piggyvest.dto.response.RegisterUserResponse;
import africa.semicolon.my_piggyvest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

@Autowired
    UserService userService;

@PostMapping("/register")
public RegisterUserResponse register (@RequestBody RegisterUserRequest registerUserRequest){
    return userService.registerUser(registerUserRequest);
}
@PostMapping("/login")
    public LoginUserResponse response (@RequestBody LoginUserRequest request){
    return userService.loginUser(request);
}

}
