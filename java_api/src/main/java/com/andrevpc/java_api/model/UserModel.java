package com.andrevpc.java_api.model;

import java.util.Collection;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Put @Getter @Setter automatically
@AllArgsConstructor // Generate constructor with all the fields
@Document("user")
public class UserModel implements UserDetails {
    @Id
    private String id;
    private String email;
    private String password;
    private String name;
    private Boolean isTrainer;
    private List<String> plan;
    private List<String> users;

    public UserModel(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public UserModel() {
    }
    
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("USER"));
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}