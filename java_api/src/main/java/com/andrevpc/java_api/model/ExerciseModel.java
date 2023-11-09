package com.andrevpc.java_api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document("exercise")
public class ExerciseModel {
    @Id
    private String id;

    private String name;
    private String mainMuscle;
    private List<String> auxMuscle;
    private String equipment;
    private Integer numSets;
    private Float weight;
    private Integer repetitionsPerSet;
}