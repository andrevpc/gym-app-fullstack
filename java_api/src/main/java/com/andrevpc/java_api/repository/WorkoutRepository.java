package com.andrevpc.java_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.andrevpc.java_api.model.WorkoutModel;

public interface WorkoutRepository extends MongoRepository<WorkoutModel, String> { }