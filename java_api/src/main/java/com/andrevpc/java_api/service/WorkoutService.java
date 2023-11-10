package com.andrevpc.java_api.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrevpc.java_api.model.WorkoutModel;
import com.andrevpc.java_api.repository.WorkoutRepository;

@Service
public class WorkoutService {

    @Autowired
    private WorkoutRepository workoutRepository;

    public WorkoutModel save(WorkoutModel workoutModel) {
        return this.workoutRepository.save(workoutModel);
    }

    public void save(String id, LocalDateTime start, LocalTime duration, String day, String user, String trainer) {
        this.workoutRepository.save(new WorkoutModel(id, start, duration, day, user, trainer));
    }

    public List<WorkoutModel> findAll() {
        return (List<WorkoutModel>) this.workoutRepository.findAll();
    }

    public Optional<WorkoutModel> findById(String id) {
        return this.workoutRepository.findById(id);
    }

    public void delete(String id) {
        this.workoutRepository.deleteById(id);
    }

}