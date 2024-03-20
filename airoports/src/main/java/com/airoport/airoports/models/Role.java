package com.airoport.airoports.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import java.util.Objects;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class Role implements GrantedAuthority {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @jakarta.persistence.Column(name = "role_id")
    private Long roleId;

    @Basic
    @Column(name = "title")
    private String title;

    @Override
    public String getAuthority() {
        return this.title;
    }
}
