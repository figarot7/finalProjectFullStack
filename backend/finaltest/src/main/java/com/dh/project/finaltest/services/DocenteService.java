package com.dh.project.finaltest.services;

import com.dh.project.finaltest.domain.Docente;
import com.dh.project.finaltest.repository.DocenteRepository;
import com.dh.project.finaltest.web.DocenteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by skypper on 17-06-17.
 */
@Service
public class DocenteService {
    @Autowired
    private DocenteRepository docenteRepository;

    public List<Docente> getAllDocentes() {
        return null;
    }

    public void createDocente(DocenteController.RequestDocenteDTO requestDocenteDTO) {
    }

    public ResponseEntity<Docente> getDocenteById(String id) {
        return null;
    }

    public ResponseEntity<Docente> updateDocente(DocenteController.RequestDocenteDTO requestDocenteDTO, String id) {
        return null;
    }

    public void deleteDocente(String id) {
    }
}
