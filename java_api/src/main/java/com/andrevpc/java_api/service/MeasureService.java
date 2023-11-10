package com.andrevpc.java_api.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrevpc.java_api.model.MeasureModel;
import com.andrevpc.java_api.repository.MeasureRepository;

@Service
public class MeasureService {

    @Autowired
    private MeasureRepository measureRepository;

    public MeasureModel save(MeasureModel measureModel) {
        return this.measureRepository.save(measureModel);
    }

    public void save(String id, String user, Float weight, Float height, LocalDateTime measuredAt) {
        this.measureRepository.save(new MeasureModel(id, user, weight, height, measuredAt));
    }

    public List<MeasureModel> findAll() {
        return (List<MeasureModel>) this.measureRepository.findAll();
    }

    public Optional<MeasureModel> findById(String id) {
        return this.measureRepository.findById(id);
    }

    public void delete(String id) {
        this.measureRepository.deleteById(id);
    }

}