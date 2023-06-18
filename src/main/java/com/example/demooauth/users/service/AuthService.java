package com.example.demooauth.users.service;

import com.example.demooauth.users.domain.User;
import com.example.demooauth.users.dtos.UserDTO;

public interface AuthService {
    UserDTO registerUser(UserDTO user);
}
