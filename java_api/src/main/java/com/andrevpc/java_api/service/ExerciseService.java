package com.andrevpc.java_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrevpc.java_api.model.ExerciseModel;
import com.andrevpc.java_api.repository.ExerciseRepository;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;

    public ExerciseModel save(ExerciseModel exerciseModel) {
        return this.exerciseRepository.save(exerciseModel);
    }

    public void save(String id, String name, String mainMuscle, List<String> auxMuscle,
            String equipment, Integer numSets, Float weight, Integer repetitionsPerSet) {
        this.exerciseRepository.save(new ExerciseModel(id, name, mainMuscle, auxMuscle, equipment, numSets, weight, repetitionsPerSet));
    }

    public List<ExerciseModel> findAll() {
        return (List<ExerciseModel>) this.exerciseRepository.findAll();
    }

    public Optional<ExerciseModel> findById(String id) {
        return this.exerciseRepository.findById(id);
    }

    public void delete(String id) {
        this.exerciseRepository.deleteById(id);
    }

}