package com.andrevpc.java_api.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document("day")
public class HistoryOfPlansModel {
    @Id
    private String id;

    private String user;
    private String trainer;
    private LocalDate startDay;
    private LocalDate endDay;
    private List<String> plan;
}