package com.example.demooauth.roles.service;

import com.example.demooauth.roles.domain.Roles;
import com.example.demooauth.roles.domain.RolesRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{
    private final RolesRepository rolesRepository;

    public RoleServiceImpl(RolesRepository rolesRepository){
        this.rolesRepository = rolesRepository;
    }

    @Override
    public Roles createRole(Roles roles) {
        return rolesRepository.save(roles);
    }
}
