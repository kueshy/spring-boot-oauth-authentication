package com.example.demooauth.roles.roles_permissions.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;

@SuperBuilder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RolesPermissionsDTO {
    private String id_role;
    private String id_permission;
}
