package com.andrevpc.java_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.andrevpc.java_api.model.HistoryOfPlansModel;

public interface HistoryOfPlansRepository extends MongoRepository<HistoryOfPlansModel, String> { }