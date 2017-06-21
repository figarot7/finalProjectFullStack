package com.dh.project.finaltest.services;

import com.dh.project.finaltest.domain.AsignacionEstudiante;
import com.dh.project.finaltest.repository.AsignacionEstudianteRepository;
import com.dh.project.finaltest.web.AsignacionEstudianteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by skypper on 17-06-17.
 */
@Service
public class AsignacionEstudianteService {
    @Autowired
    private AsignacionEstudianteRepository asignacionEstudianteRepository;

    public List<AsignacionEstudiante> getAllAsignacionEstudiantes() {
        return null;
    }

    public void createAsignacionEstudiante(AsignacionEstudianteController.RequestAsignacionEstudianteDTO requestAsignacionEstudianteDTO) {
    }

    public ResponseEntity<AsignacionEstudiante> getAsignacionEstudianteById(String id) {
        return null;
    }

    public ResponseEntity<AsignacionEstudiante> updateAsignacionEstudiante(AsignacionEstudianteController.RequestAsignacionEstudianteDTO requestAsignacionEstudianteDTO, String id) {
        return null;
    }

    public void deleteAsignacionEstudiante(String id) {
    }
}
