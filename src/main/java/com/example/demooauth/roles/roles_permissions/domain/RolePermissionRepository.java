package com.example.demooauth.roles.roles_permissions.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionRepository extends JpaRepository<RolesPermissions, String> {
}
