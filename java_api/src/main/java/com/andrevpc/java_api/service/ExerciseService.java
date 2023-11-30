package com.andrevpc.java_api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrevpc.java_api.model.DayModel;
import com.andrevpc.java_api.model.ExerciseModel;
import com.andrevpc.java_api.repository.ExerciseRepository;
import com.andrevpc.java_api.repository.DayRepository;

@Service
public class ExerciseService {

    @Autowired
    private ExerciseRepository exerciseRepository;
    @Autowired
    private DayRepository dayRepository;

    public ExerciseModel save(ExerciseModel exerciseModel) {
        return this.exerciseRepository.save(exerciseModel);
    }

    public void save(String id, String name, String mainMuscle, List<String> auxMuscle,
            String equipment, Integer numSets, Float weight, Integer repetitionsPerSet, String img) {
        this.exerciseRepository.save(new ExerciseModel(id, name, mainMuscle, auxMuscle, equipment, numSets, weight, repetitionsPerSet, img));
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

    public List<ExerciseModel> findByDay(String id) {
        List<ExerciseModel> exerciseList = new ArrayList<ExerciseModel>();
        var day = this.dayRepository.findById(id);

        var exercises = day.get().getExercises();

        for (String exercise : exercises) {
            var option = this.exerciseRepository.findById(exercise);
            if (option.isPresent()) {
                exerciseList.add(option.get());
            }
        }

        return exerciseList;
    }

}