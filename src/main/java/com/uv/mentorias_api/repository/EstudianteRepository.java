package com.uv.mentorias_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uv.mentorias_api.model.EstudianteModel;

public interface EstudianteRepository extends JpaRepository<EstudianteModel, Long> {
    
}
