package com.dh.project.finaltest.services;

import com.dh.project.finaltest.domain.Estudiante;
import com.dh.project.finaltest.repository.EstudianteRepository;
import com.dh.project.finaltest.web.EstudianteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        return estudianteRepository.findAll();
    }

    public void createEstudiante(EstudianteController.RequestEstudianteDTO requestEstudianteDTO) {
        Estudiante estudiante = new Estudiante();
        estudiante.setCodigo(requestEstudianteDTO.getCodigo());
        estudiante.setNombres(requestEstudianteDTO.getNombres());
        estudiante.setApellidos(requestEstudianteDTO.getApellidos());
        estudiante.setEmail(requestEstudianteDTO.getEmail());
        estudiante.setTelefono(requestEstudianteDTO.getTelefono());
        estudiante.setDireccion(requestEstudianteDTO.getDireccion());
        estudianteRepository.save(estudiante);
    }

    public ResponseEntity<Estudiante> getEstudianteById(String id) {
        Estudiante estudiante = estudianteRepository.findOne(id);
        if(estudiante == null){
            return new ResponseEntity<Estudiante>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<Estudiante>(estudiante, HttpStatus.OK);
        }
    }

    public ResponseEntity<Estudiante> updateEstudiante(EstudianteController.RequestEstudianteDTO requestEstudianteDTO, String id) {
        Estudiante estudiante = estudianteRepository.findOne(id);
        if(estudiante == null){
            return new ResponseEntity<Estudiante>(HttpStatus.NOT_FOUND);
        }else{
            estudiante.setCodigo(requestEstudianteDTO.getCodigo());
            estudiante.setNombres(requestEstudianteDTO.getNombres());
            estudiante.setApellidos(requestEstudianteDTO.getApellidos());
            estudiante.setEmail(requestEstudianteDTO.getEmail());
            estudiante.setTelefono(requestEstudianteDTO.getTelefono());
            estudiante.setDireccion(requestEstudianteDTO.getDireccion());
            estudianteRepository.save(estudiante);
            return new ResponseEntity<Estudiante>(estudiante, HttpStatus.OK);
        }
    }

    public void deleteEstudiante(String id) {
    }
}
