package com.andrevpc.java_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.andrevpc.java_api.model.MeasureModel;

public interface MeasureRepository extends MongoRepository<MeasureModel, String> { }