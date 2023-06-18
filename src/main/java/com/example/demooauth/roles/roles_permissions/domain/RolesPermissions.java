package com.example.demooauth.roles.roles_permissions.domain;

import com.example.demooauth.roles.domain.Roles;
import com.example.demooauth.roles.permissions.domain.Permissions;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "s_roles_permissions")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RolesPermissions {

    @EmbeddedId
    private RolesPermissionsId id;

    @ManyToOne
    @JoinColumn(name = "id_role", insertable = false, updatable = false)
    private Roles role;

    @ManyToOne
    @JoinColumn(name = "id_permission", insertable = false, updatable = false)
    private Permissions permission;

}
