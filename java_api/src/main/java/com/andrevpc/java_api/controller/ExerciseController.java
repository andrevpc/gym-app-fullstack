package com.andrevpc.java_api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andrevpc.java_api.model.ExerciseModel;
import com.andrevpc.java_api.service.ExerciseService;

@RestController
@RequestMapping("/exercise")
public class ExerciseController {

    @Autowired
    private ExerciseService exerciseService;

    @GetMapping("")
    public List<ExerciseModel> getAllExercise() {
        List<ExerciseModel> listRes = exerciseService.findAll();
        return listRes;
    }

    @GetMapping("/{id}")
    public Optional<ExerciseModel> getExerciseById(@PathVariable String id) {
        Optional<ExerciseModel> listRes = exerciseService.findById(id);
        return listRes;
    }

    @PostMapping("")
    public void newExercise(@RequestBody ExerciseModel newExercise) {
        exerciseService.save(newExercise);
    }

    @PutMapping("/{id}")
    public void putExercise(@RequestBody ExerciseModel newExercise, @PathVariable String id) {
        exerciseService.save((String) id, (String) newExercise.getName(),
        (String) newExercise.getMainMuscle(), (List<String>) newExercise.getAuxMuscle(), (String) newExercise.getEquipment(),
        (Integer) newExercise.getNumSets(), (Float) newExercise.getWeight(), (Integer) newExercise.getRepetitionsPerSet());
    }

    @DeleteMapping("/{id}")
    public void deleteExercise(@PathVariable String id) {
        exerciseService.delete(id);
    }

}