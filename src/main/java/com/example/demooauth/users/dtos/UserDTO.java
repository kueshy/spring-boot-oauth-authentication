package com.example.demooauth.users.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private String id;
    private String username;
    private boolean active;
    private String id_role;
    private String password;
}
