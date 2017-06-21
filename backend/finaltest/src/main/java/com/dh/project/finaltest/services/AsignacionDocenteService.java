package com.dh.project.finaltest.services;

import com.dh.project.finaltest.domain.AsignacionDocente;
import com.dh.project.finaltest.repository.AsignacionDocenteRepository;
import com.dh.project.finaltest.web.AsignacionDocenteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by skypper on 17-06-17.
 */
@Service
public class AsignacionDocenteService {
    @Autowired
    private AsignacionDocenteRepository asignacionDocenteRepository;

    public List<AsignacionDocente> getAllAsignacionDocentes() {
        return null;
    }

    public void createAsignacionDocente(AsignacionDocenteController.RequestAsignacionDocenteDTO requestAsignacionDocenteDTO) {
    }

    public ResponseEntity<AsignacionDocente> getAsignacionDocenteById(String id) {
        return null;
    }

    public ResponseEntity<AsignacionDocente> updateAsignacionDocente(AsignacionDocenteController.RequestAsignacionDocenteDTO requestAsignacionDocenteDTO, String id) {
        return null;
    }

    public void deleteAsignacionDocente(String id) {
    }
}
