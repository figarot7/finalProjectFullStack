package com.dh.project.finaltest.services;

import com.dh.project.finaltest.domain.Materia;
import com.dh.project.finaltest.repository.MateriaRepository;
import com.dh.project.finaltest.web.MateriaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        return materiaRepository.findAll();
    }

    public void createMateria(MateriaController.RequestMateriaDTO requestMateriaDTO) {
        Materia materia = new Materia();
        materia.setCodigo(requestMateriaDTO.getCodigo());
        materia.setNombre(requestMateriaDTO.getNombre());
        materia.setGrado(requestMateriaDTO.getGrado());
        materia.setDescripcion(requestMateriaDTO.getDescripcion());
        materiaRepository.save(materia);
    }

    public ResponseEntity<Materia> getMateriaById(String id) {
        Materia materia = materiaRepository.findOne(id);
        if(materia == null){
            return new ResponseEntity<Materia>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<Materia>(materia, HttpStatus.OK);
        }
    }

    public ResponseEntity<Materia> updateMateria(MateriaController.RequestMateriaDTO requestMateriaDTO, String id) {
        Materia materia = materiaRepository.findOne(id);
        if(materia == null){
            return new ResponseEntity<Materia>(HttpStatus.NOT_FOUND);
        }else{
            materia.setCodigo(requestMateriaDTO.getCodigo());
            materia.setNombre(requestMateriaDTO.getNombre());
            materia.setGrado(requestMateriaDTO.getGrado());
            materia.setDescripcion(requestMateriaDTO.getDescripcion());
            materiaRepository.save(materia);
            return new ResponseEntity<Materia>(materia, HttpStatus.OK);
        }
    }

    public void deleteMateria(String id) {
    }
}
