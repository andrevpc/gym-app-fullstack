package com.andrevpc.java_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrevpc.java_api.model.DayModel;
import com.andrevpc.java_api.repository.DayRepository;

@Service
public class DayService {

    @Autowired
    private DayRepository dayRepository;

    public DayModel save(DayModel dayModel) {
        return this.dayRepository.save(dayModel);
    }

    public void save(String id, List<String> exercises) {
        this.dayRepository.save(new DayModel(id, exercises));
    }

    public List<DayModel> findAll() {
        return (List<DayModel>) this.dayRepository.findAll();
    }

    public Optional<DayModel> findById(String id) {
        return this.dayRepository.findById(id);
    }

    public void delete(String id) {
        this.dayRepository.deleteById(id);
    }

}