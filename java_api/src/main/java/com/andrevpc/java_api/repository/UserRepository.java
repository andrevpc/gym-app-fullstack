package com.andrevpc.java_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.andrevpc.java_api.model.UserModel;
import java.util.List;

public interface UserRepository extends MongoRepository<UserModel, String> {
    @Query("{'email': ?0}")
    UserModel findByEmail(String email);
}