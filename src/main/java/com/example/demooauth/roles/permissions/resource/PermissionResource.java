package com.example.demooauth.roles.permissions.resource;

import com.example.demooauth.roles.permissions.domain.Permissions;
import com.example.demooauth.roles.permissions.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/permissions")
@RequiredArgsConstructor
public class PermissionResource {

    private final PermissionService service;

    @PostMapping()
    public ResponseEntity<?> createPermission(@RequestBody Permissions permission){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createPermission(permission));
    }



}
