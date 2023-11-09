package com.andrevpc.java_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.andrevpc.java_api.model.ExerciseModel;

public interface ExerciseRepository extends MongoRepository<ExerciseModel, String> { }