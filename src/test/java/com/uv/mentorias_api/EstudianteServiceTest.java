package com.uv.mentorias_api;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.uv.mentorias_api.model.EstudianteModel;
import com.uv.mentorias_api.repository.EstudianteRepository;

@SpringBootTest
class EstudianteServiceTest {

    @Autowired
    public EstudianteRepository repository;

    @Test
    void debeGuardarEstudiante(){
        EstudianteModel estudiante = new EstudianteModel();
        estudiante.setNombre("José");
        estudiante.setCarrera("Ingeniería");

        EstudianteModel guardado = repository.save(estudiante);

        assertNotNull(guardado.getId());
    }
}
