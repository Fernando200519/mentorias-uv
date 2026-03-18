package com.uv.mentorias_api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uv.mentorias_api.model.EstudianteModel;
import com.uv.mentorias_api.model.MentorModel;
import com.uv.mentorias_api.model.MentoriaModel;
import com.uv.mentorias_api.repository.EstudianteRepository;
import com.uv.mentorias_api.repository.MentorRepository;
import com.uv.mentorias_api.repository.MentoriaRepository;

@SpringBootTest
class MentoriaServiceTest {

    @Autowired
    public MentoriaRepository mentoriaRepo;

    @Autowired
    public MentorRepository mentorRepo;

    @Autowired
    public EstudianteRepository estudianteRepo;

    @Test
    void debeGuardarMentoriaConRelaciones(){
        EstudianteModel estudiante = estudianteRepo.save(new EstudianteModel());
        MentorModel mentor = mentorRepo.save(new MentorModel());

        MentoriaModel mentoria = new MentoriaModel();
        mentoria.setEstudiante(estudiante);
        mentoria.setMentor(mentor);
        mentoria.setFecha("18/03/2026");

        MentoriaModel guardado = mentoriaRepo.save(mentoria);

        assertNotNull(guardado.getId());
        assertEquals(mentor.getId(), guardado.getMentor().getId());
    }
}
