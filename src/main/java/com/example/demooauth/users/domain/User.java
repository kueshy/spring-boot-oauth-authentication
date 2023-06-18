package com.example.demooauth.users.domain;

import com.example.demooauth.roles.domain.Roles;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "s_users")
public class User {
    @Id
    private String id;
    @Column(name = "username")
    private String name;
    @Column(name = "active")
    private boolean active;

    @ManyToOne()
    @JoinColumn(name = "id_role")
    private Roles role;
}
