package com.example.demooauth.roles.permissions.service;

import com.example.demooauth.roles.permissions.domain.Permissions;
import com.example.demooauth.roles.permissions.domain.PermissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService{

    private final PermissionRepository repository;

    @Override
    public Permissions createPermission(Permissions permission) {
        return repository.save(permission);
    }
}
