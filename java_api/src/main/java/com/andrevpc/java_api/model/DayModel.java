package com.andrevpc.java_api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document("day")
public class DayModel {
    @Id
    private String id;
    private String Name;
    private List<String> Exercises;
}