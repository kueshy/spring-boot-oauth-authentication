package com.example.demooauth.roles.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "s_roles")
public class Roles {
    @Id
    private String id;
    private String name;
}
