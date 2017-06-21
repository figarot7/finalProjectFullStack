package com.dh.project.finaltest.services;

import com.dh.project.finaltest.domain.Docente;
import com.dh.project.finaltest.repository.DocenteRepository;
import com.dh.project.finaltest.web.DocenteController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        return docenteRepository.findAll();
    }

    public void createDocente(DocenteController.RequestDocenteDTO requestDocenteDTO) {
        Docente docente = new Docente();
        docente.setCodigo(requestDocenteDTO.getCodigo());
        docente.setNombres(requestDocenteDTO.getNombres());
        docente.setApellidos(requestDocenteDTO.getApellidos());
        docente.setEmail(requestDocenteDTO.getEmail());
        docente.setTelefono(requestDocenteDTO.getTelefono());
        docente.setDireccion(requestDocenteDTO.getDireccion());
        docente.setSalario(requestDocenteDTO.getSalario());
        docenteRepository.save(docente);
    }

    public ResponseEntity<Docente> getDocenteById(String id) {
        Docente docente = docenteRepository.findOne(id);
        if (docente == null){
            return new ResponseEntity<Docente>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<Docente>(docente, HttpStatus.OK);
        }
    }

    public ResponseEntity<Docente> updateDocente(DocenteController.RequestDocenteDTO requestDocenteDTO, String id) {
        Docente docente = docenteRepository.findOne(id);
        if (docente == null){
            return new ResponseEntity<Docente>(HttpStatus.NOT_FOUND);
        }else{
            docente.setCodigo(requestDocenteDTO.getCodigo());
            docente.setNombres(requestDocenteDTO.getNombres());
            docente.setApellidos(requestDocenteDTO.getApellidos());
            docente.setEmail(requestDocenteDTO.getEmail());
            docente.setTelefono(requestDocenteDTO.getTelefono());
            docente.setDireccion(requestDocenteDTO.getDireccion());
            docente.setSalario(requestDocenteDTO.getSalario());
            docenteRepository.save(docente);
            return new ResponseEntity<Docente>(docente, HttpStatus.OK);
        }
    }

    public void deleteDocente(String id) {
    }
}
