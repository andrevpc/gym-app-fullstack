package com.andrevpc.java_api.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document("day")
public class WorkoutModel {
    @Id
    private String id;

    private LocalDateTime start;
    private LocalTime duration;
    private String day;
    private String user;
    private String trainer;
}