package com.example.demooauth.users.service;

import com.example.demooauth.roles.domain.Roles;
import com.example.demooauth.roles.domain.RolesRepository;
import com.example.demooauth.users.domain.User;
import com.example.demooauth.users.domain.UserPassword;
import com.example.demooauth.users.domain.UserPasswordRepository;
import com.example.demooauth.users.domain.UserRepository;
import com.example.demooauth.users.dtos.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import javax.transaction.Transactional;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository repository;
    private final RolesRepository rolesRepository;
    private final UserPasswordRepository userPasswordRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public UserDTO registerUser(UserDTO userDTO) {
        Optional<Roles> role = rolesRepository.findById(userDTO.getId_role());
        if(role.isPresent()){
            User user = User.builder()
                    .id(userDTO.getId())
                    .name(userDTO.getUsername())
                    .active(userDTO.isActive())
                    .role(role.get())
                    .build();
            user = repository.save(user);

            UserPassword userPassword = UserPassword.builder()
                    .userId(user.getId())
                    .password(passwordEncoder.encode(userDTO.getPassword()))
                    .build();

            userPasswordRepository.save(userPassword);
        }else {
            throw new RuntimeException("Role doesn't exist");
        }
        return userDTO;
    }
}
