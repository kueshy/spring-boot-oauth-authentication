package com.example.demooauth.roles.roles_permissions.service;

import com.example.demooauth.roles.domain.Roles;
import com.example.demooauth.roles.domain.RolesRepository;
import com.example.demooauth.roles.permissions.domain.PermissionRepository;
import com.example.demooauth.roles.permissions.domain.Permissions;
import com.example.demooauth.roles.roles_permissions.domain.RolePermissionRepository;
import com.example.demooauth.roles.roles_permissions.domain.RolesPermissions;
import com.example.demooauth.roles.roles_permissions.domain.RolesPermissionsId;
import com.example.demooauth.roles.roles_permissions.dtos.RolesPermissionsDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RolePermissionServiceImpl implements RolePermissionService {

    private final RolePermissionRepository repository;
    private final PermissionRepository permissionRepository;
    private final RolesRepository rolesRepository;

    @Override
    public RolesPermissionsDTO createPermission(RolesPermissionsDTO permissionsDTO) throws Exception {
        Optional<Roles> roles = rolesRepository.findById(permissionsDTO.getId_role());
        Optional<Permissions> permissions = permissionRepository.findById(permissionsDTO.getId_permission());
        if(roles.isPresent() && permissions.isPresent()){
            RolesPermissionsId permissionsId = RolesPermissionsId.builder()
                    .id_permission(permissionsDTO.getId_permission())
                    .id_role(permissionsDTO.getId_role())
                    .build();
            RolesPermissions rolesPermissions = RolesPermissions.builder()
                    .id(permissionsId)
                    .role(roles.get())
                    .permission(permissions.get())
                    .build();
            repository.save(rolesPermissions);

        }
        else {
            throw new Exception("Roles or Permissions not found");
        }
    return permissionsDTO;
    }
}
