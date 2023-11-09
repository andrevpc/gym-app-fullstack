package com.andrevpc.java_api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document("day")
public class DayModel {
    @Id
    private String id;

    @DBRef
    private List<ExerciseModel> 

    private String name;
    private String mainMuscle;
    private List<String> auxMuscle;
    private String equipment;
    private Integer numSets;
    private Float weight;
    private Integer repetitionsPerSet;
}