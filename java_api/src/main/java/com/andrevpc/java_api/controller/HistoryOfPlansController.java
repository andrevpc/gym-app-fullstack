package com.andrevpc.java_api.controller;

import java.time.LocalDate;
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

import com.andrevpc.java_api.model.HistoryOfPlansModel;
import com.andrevpc.java_api.service.HistoryOfPlansService;

@RestController
@RequestMapping("/historyOfPlans")
public class HistoryOfPlansController {

    @Autowired
    private HistoryOfPlansService historyOfPlansService;

    @GetMapping("")
    public List<HistoryOfPlansModel> getAllHistoryOfPlans() {
        List<HistoryOfPlansModel> listRes = historyOfPlansService.findAll();
        return listRes;
    }

    @GetMapping("/{id}")
    public Optional<HistoryOfPlansModel> getHistoryOfPlansById(@PathVariable String id) {
        Optional<HistoryOfPlansModel> listRes = historyOfPlansService.findById(id);
        return listRes;
    }

    @PostMapping("")
    public void newHistoryOfPlans(@RequestBody HistoryOfPlansModel newHistoryOfPlans) {
        historyOfPlansService.save(newHistoryOfPlans);
    }

    @PutMapping("/{id}")
    public void putHistoryOfPlans(@RequestBody HistoryOfPlansModel newHistoryOfPlans, @PathVariable String id) {
        historyOfPlansService.save((String) id, (String) newHistoryOfPlans.getUser(), (String) newHistoryOfPlans.getTrainer(),
        (LocalDate) newHistoryOfPlans.getStartDay(), (LocalDate) newHistoryOfPlans.getEndDay(), (List<String>) newHistoryOfPlans.getPlan());
    }

    @DeleteMapping("/{id}")
    public void deleteHistoryOfPlans(@PathVariable String id) {
        historyOfPlansService.delete(id);
    }

}