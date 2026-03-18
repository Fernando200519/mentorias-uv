package com.uv.mentorias_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uv.mentorias_api.model.MentoriaModel;

public interface MentoriaRepository extends JpaRepository<MentoriaModel, Long>{
}
