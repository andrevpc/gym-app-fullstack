package com.andrevpc.java_api.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document("day")
public class MeasureModel {
    @Id
    private String id;

    private String user;
    private Float weight;
    private Float height;
    private LocalDateTime measuredAt;
}