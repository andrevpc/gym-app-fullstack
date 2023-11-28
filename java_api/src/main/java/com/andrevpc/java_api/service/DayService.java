package com.andrevpc.java_api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andrevpc.java_api.model.DayModel;
import com.andrevpc.java_api.repository.DayRepository;
import com.andrevpc.java_api.repository.UserRepository;

@Service
public class DayService {

    @Autowired
    private DayRepository dayRepository;
    
    @Autowired
    private UserRepository userRepository;

    public DayModel save(DayModel dayModel) {
        return this.dayRepository.save(dayModel);
    }

    public void save(String id, String name, List<String> muscles, List<String> exercises) {
        this.dayRepository.save(new DayModel(id, name, muscles, exercises));
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

    public List<DayModel> findByUser(String email) {
        List<DayModel> dayList = new ArrayList<DayModel>();
        var user = this.userRepository.findByEmail(email);
        List<String> days = user.getPlan();

        for (String day : days) {
            var option = this.dayRepository.findById(day);
            if (option.isPresent()) {
                dayList.add(option.get());
            }
        }

        return dayList;
    }

}