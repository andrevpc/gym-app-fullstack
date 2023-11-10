package com.andrevpc.java_api.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrevpc.java_api.model.HistoryOfPlansModel;
import com.andrevpc.java_api.repository.HistoryOfPlansRepository;

@Service
public class HistoryOfPlansService {

    @Autowired
    private HistoryOfPlansRepository historyOfPlansRepository;

    public HistoryOfPlansModel save(HistoryOfPlansModel historyOfPlansModel) {
        return this.historyOfPlansRepository.save(historyOfPlansModel);
    }

    public void save(String id, String user, String trainer, LocalDate startDay, LocalDate endDay, List<String> Plan) {
        this.historyOfPlansRepository.save(new HistoryOfPlansModel(id, user, trainer, startDay, endDay, Plan));
    }

    public List<HistoryOfPlansModel> findAll() {
        return (List<HistoryOfPlansModel>) this.historyOfPlansRepository.findAll();
    }

    public Optional<HistoryOfPlansModel> findById(String id) {
        return this.historyOfPlansRepository.findById(id);
    }

    public void delete(String id) {
        this.historyOfPlansRepository.deleteById(id);
    }

}