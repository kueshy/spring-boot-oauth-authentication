package com.example.demooauth.users.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPasswordRepository extends JpaRepository<UserPassword, String> {
}
