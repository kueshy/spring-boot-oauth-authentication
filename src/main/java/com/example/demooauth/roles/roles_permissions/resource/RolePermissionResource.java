package com.example.demooauth.roles.roles_permissions.resource;

import com.example.demooauth.roles.roles_permissions.domain.RolesPermissions;
import com.example.demooauth.roles.roles_permissions.dtos.RolesPermissionsDTO;
import com.example.demooauth.roles.roles_permissions.service.RolePermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/roles_permissions")
@RequiredArgsConstructor
public class RolePermissionResource {

    private final RolePermissionService service;

    @PostMapping()
    public ResponseEntity<?> createRolePermission(@RequestBody RolesPermissionsDTO permissionsDTO) throws Exception {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createPermission(permissionsDTO));
    }



}
