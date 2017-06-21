package com.dh.project.finaltest.services;

import com.dh.project.finaltest.domain.Estudiante;
import com.dh.project.finaltest.repository.EstudianteRepository;
import com.dh.project.finaltest.web.EstudianteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by skypper on 17-06-17.
 */
@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> getAllEstudiantes() {
        return null;
    }

    public void createEstudiante(EstudianteController.RequestEstudianteDTO requestEstudianteDTO) {
    }

    public ResponseEntity<Estudiante> getEstudianteById(String id) {
        return null;
    }

    public ResponseEntity<Estudiante> updateEstudiante(EstudianteController.RequestEstudianteDTO requestEstudianteDTO, String id) {
        return null;
    }

    public void deleteEstudiante(String id) {
    }
}
