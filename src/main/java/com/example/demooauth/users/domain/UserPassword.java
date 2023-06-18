package com.example.demooauth.users.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "s_users_passwords")
public class UserPassword {
    @Id
    @Column(name = "id_user", length = 36)
    private String userId;
    @Column(name = "password", length = 255, nullable = false)
    private String password;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private User user;
}
