package com.andrevpc.java_api.controller;

import java.time.LocalDateTime;
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

import com.andrevpc.java_api.model.MeasureModel;
import com.andrevpc.java_api.service.MeasureService;

@RestController
@RequestMapping("/measure")
public class MeasureController {

    @Autowired
    private MeasureService measureService;

    @GetMapping("")
    public List<MeasureModel> getAllMeasure() {
        List<MeasureModel> listRes = measureService.findAll();
        return listRes;
    }

    @GetMapping("/{id}")
    public Optional<MeasureModel> getMeasureById(@PathVariable String id) {
        Optional<MeasureModel> listRes = measureService.findById(id);
        return listRes;
    }

    @PostMapping("")
    public void newMeasure(@RequestBody MeasureModel newMeasure) {
        measureService.save(newMeasure);
    }

    @PutMapping("/{id}")
    public void putMeasure(@RequestBody MeasureModel newMeasure, @PathVariable String id) {
        measureService.save((String) id, (String) newMeasure.getUser(), (Float) newMeasure.getWeight(),
        (Float) newMeasure.getHeight(), (LocalDateTime) newMeasure.getMeasuredAt());
    }

    @DeleteMapping("/{id}")
    public void deleteMeasure(@PathVariable String id) {
        measureService.delete(id);
    }

}