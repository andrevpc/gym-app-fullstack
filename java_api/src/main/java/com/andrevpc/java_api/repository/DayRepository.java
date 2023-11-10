package com.andrevpc.java_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.andrevpc.java_api.model.DayModel;

public interface DayRepository extends MongoRepository<DayModel, String> { }