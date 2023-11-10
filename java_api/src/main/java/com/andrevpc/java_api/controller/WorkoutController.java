package com.andrevpc.java_api.controller;

import java.time.LocalDateTime;
import java.time.LocalTime;
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

import com.andrevpc.java_api.model.WorkoutModel;
import com.andrevpc.java_api.service.WorkoutService;

@RestController
@RequestMapping("/workout")
public class WorkoutController {

    @Autowired
    private WorkoutService workoutService;

    @GetMapping("")
    public List<WorkoutModel> getAllWorkout() {
        List<WorkoutModel> listRes = workoutService.findAll();
        return listRes;
    }

    @GetMapping("/{id}")
    public Optional<WorkoutModel> getWorkoutById(@PathVariable String id) {
        Optional<WorkoutModel> listRes = workoutService.findById(id);
        return listRes;
    }

    @PostMapping("")
    public void newWorkout(@RequestBody WorkoutModel newWorkout) {
        workoutService.save(newWorkout);
    }

    @PutMapping("/{id}")
    public void putWorkout(@RequestBody WorkoutModel newWorkout, @PathVariable String id) {
        workoutService.save((String) id, (LocalDateTime) newWorkout.getStart(), (LocalTime) newWorkout.getDuration(),
                (String) newWorkout.getDay(), (String) newWorkout.getUser(), (String) newWorkout.getTrainer());
    }

    @DeleteMapping("/{id}")
    public void deleteWorkout(@PathVariable String id) {
        workoutService.delete(id);
    }

}