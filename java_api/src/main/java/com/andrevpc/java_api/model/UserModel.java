package com.andrevpc.java_api.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data // Não precisa colocar o @Getter @Setter
@AllArgsConstructor // Gera construtor com todos os inputs
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
