package com.andrevpc.java_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrevpc.java_api.model.UserModel;
import com.andrevpc.java_api.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel save(UserModel userModel) {
        return this.userRepository.save(userModel);
    }

    public void save(String id, String email, String password, String name,
            Boolean isTrainer, List<String> Plan, List<String> Users) {
        this.userRepository.save(new UserModel(id, email, password, name, isTrainer, Plan, Users));
    }

    public List<UserModel> findAll() {
        return (List<UserModel>) this.userRepository.findAll();
    }

    public UserModel findByEmail(String email) {
        return (UserModel) this.userRepository.findByEmail(email);
    }

    public void delete(String id) {
        this.userRepository.deleteById(id);
    }
}