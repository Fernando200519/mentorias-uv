package com.uv.mentorias_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uv.mentorias_api.model.MentoriaModel;
import com.uv.mentorias_api.repository.MentoriaRepository;

@RestController
@RequestMapping("/mentorias")
public class MentoriaController {

    @Autowired
    public MentoriaRepository repository;

    @PostMapping
    public MentoriaModel crear(@RequestBody MentoriaModel mentoria){
        return repository.save(mentoria);
    }

    @GetMapping
    public List<MentoriaModel> listar(){
        return repository.findAll();
    }
}
