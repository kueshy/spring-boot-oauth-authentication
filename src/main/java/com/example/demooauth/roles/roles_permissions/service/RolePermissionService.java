package com.example.demooauth.roles.roles_permissions.service;

import com.example.demooauth.roles.roles_permissions.domain.RolesPermissions;
import com.example.demooauth.roles.roles_permissions.dtos.RolesPermissionsDTO;

public interface RolePermissionService {
    RolesPermissionsDTO createPermission(RolesPermissionsDTO permissionsDTO) throws Exception;
}
