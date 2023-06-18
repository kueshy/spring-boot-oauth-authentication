package com.example.demooauth.users.resource;

import com.example.demooauth.users.domain.User;
import com.example.demooauth.users.dtos.UserDTO;
import com.example.demooauth.users.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {

    private final AuthService authService;

    @PostMapping()
    public ResponseEntity<?> registerUser(@RequestBody UserDTO user){
        return ResponseEntity.status(HttpStatus.CREATED).body(authService.registerUser(user));
    }
}
