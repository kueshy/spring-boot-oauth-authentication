package com.example.demooauth.roles.roles_permissions.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RolesPermissionsId implements Serializable {
    @Column(name = "id_role")
    private String id_role;
    @Column(name = "id_permission")
    private String id_permission;
}
