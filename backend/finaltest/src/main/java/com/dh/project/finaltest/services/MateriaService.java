package com.dh.project.finaltest.services;

import com.dh.project.finaltest.domain.Materia;
import com.dh.project.finaltest.repository.MateriaRepository;
import com.dh.project.finaltest.web.MateriaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by skypper on 17-06-17.
 */
@Service
public class MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;

    public List<Materia> getAllMaterias() {
        return null;
    }

    public void createMateria(MateriaController.RequestMateriaDTO requestMateriaDTO) {
    }

    public ResponseEntity<Materia> getMateriaById(String id) {
        return null;
    }

    public ResponseEntity<Materia> updateMateria(MateriaController.RequestMateriaDTO requestMateriaDTO, String id) {
        return null;
    }

    public void deleteMateria(String id) {
    }
}
