package com.uv.mentorias_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uv.mentorias_api.model.EstudianteModel;
import com.uv.mentorias_api.repository.EstudianteRepository;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    
    @Autowired
    public EstudianteRepository repository;

    @PostMapping
    public EstudianteModel crear(@RequestBody EstudianteModel estudiante){
        return repository.save(estudiante);
    }

    @GetMapping
    public List<EstudianteModel> listar(){
        return repository.findAll();
    }
}
