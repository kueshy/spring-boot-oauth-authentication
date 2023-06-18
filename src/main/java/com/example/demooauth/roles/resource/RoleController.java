package com.example.demooauth.roles.resource;

import com.example.demooauth.roles.domain.Roles;
import com.example.demooauth.roles.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService service;

    @PostMapping("/roles")
    public ResponseEntity<?> createRole(@RequestBody Roles roles){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createRole(roles));
    }

}
