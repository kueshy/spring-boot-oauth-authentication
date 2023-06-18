package com.example.demooauth.roles.permissions.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "s_permissions")
public class Permissions {
    @Id
    private String id;
    private String label;
    private String value;
}
