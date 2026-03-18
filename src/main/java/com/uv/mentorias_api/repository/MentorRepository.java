package com.uv.mentorias_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uv.mentorias_api.model.MentorModel;

public interface MentorRepository extends JpaRepository<MentorModel, Long> {
}
