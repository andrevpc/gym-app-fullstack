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

import com.andrevpc.java_api.model.DayModel;
import com.andrevpc.java_api.service.DayService;

@RestController
@RequestMapping("/day")
public class DayController {

    @Autowired
    private DayService dayService;

    @GetMapping("")
    public List<DayModel> getAllDay() {
        List<DayModel> listRes = dayService.findAll();
        return listRes;
    }

    @GetMapping("/{id}")
    public Optional<DayModel> getDayById(@PathVariable String id) {
        Optional<DayModel> listRes = dayService.findById(id);
        return listRes;
    }

    @PostMapping("")
    public void newDay(@RequestBody DayModel newDay) {
        dayService.save(newDay);
    }

    @PutMapping("/{id}")
    public void putDay(@RequestBody DayModel newDay, @PathVariable String id) {
        dayService.save((String) id, newDay.getName(), newDay.getExercises());
    }

    @DeleteMapping("/{id}")
    public void deleteDay(@PathVariable String id) {
        dayService.delete(id);
    }

}