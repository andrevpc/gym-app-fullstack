package com.andrevpc.java_api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // Put @Getter @Setter automatically
@AllArgsConstructor // Generate constructor with all the fields
@Document("user")
public class UserModel {
    @Id
    private String id;
    private String email;
    private String password;
    private String name;
    private Boolean isTrainer;
    private List<String> plan;
    private List<String> users;
}