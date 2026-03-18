package com.uv.mentorias_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uv.mentorias_api.model.MentorModel;
import com.uv.mentorias_api.repository.MentorRepository;

@RestController
@RequestMapping("/mentores")
public class MentorController {

    @Autowired
    private MentorRepository repository;

    @PostMapping
    public MentorModel crear(@RequestBody MentorModel mentor){
        return repository.save(mentor);
    }

    @GetMapping
    public List<MentorModel> listar(){
        return repository.findAll();
    }
}
