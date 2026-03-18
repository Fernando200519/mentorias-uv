package com.uv.mentorias_api;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uv.mentorias_api.model.MentorModel;
import com.uv.mentorias_api.repository.MentorRepository;

@SpringBootTest
class MentorServiceTest {

    @Autowired
    public MentorRepository repository;

    @Test
    void debeGuardarMentor(){
        MentorModel mentor = new MentorModel();
        mentor.setNombre("Juan");

        MentorModel guardado = repository.save(mentor);

        assertNotNull(guardado.getId());
    }
}
