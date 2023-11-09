package com.andrevpc.java_api.model;

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
    // @Getter // Data
    // @Setter
    private String name;
    private short age;

    // public UserModel(String id, String name, short age) { // AllArgsConstructor
    // this.id = id;
    // this.name = name;
    // this.age = age;
    // }

    public UserModel(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public UserModel(String id) {
        this.id = id;
    }

    public UserModel() {
    }
}
