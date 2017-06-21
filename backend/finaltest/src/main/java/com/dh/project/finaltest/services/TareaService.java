package com.dh.project.finaltest.services;

import com.dh.project.finaltest.domain.Tarea;
import com.dh.project.finaltest.repository.TareaRepository;
import com.dh.project.finaltest.web.TareaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by skypper on 17-06-17.
 */
@Service
public class TareaService {
    @Autowired
    private TareaRepository tareaRepository;

    public List<Tarea> getAllTareas() {
        return tareaRepository.findAll();
    }

    public void createTarea(TareaController.RequestTareaDTO requestTareaDTO) {
        Tarea tarea = new Tarea();
        tarea.setNombre(requestTareaDTO.getNombre());
        tarea.setEstado(requestTareaDTO.getEstado());
        tarea.setDescripcion(requestTareaDTO.getDescripcion());
        tareaRepository.save(tarea);
    }

    public ResponseEntity<Tarea> getTareaById(String id) {
        Tarea tarea = tareaRepository.findOne(id);
        if(tarea == null){
            return new ResponseEntity<Tarea>(HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<Tarea>(tarea, HttpStatus.OK);
        }
    }

    public ResponseEntity<Tarea> updateTarea(TareaController.RequestTareaDTO requestTareaDTO, String id) {
        Tarea tarea = tareaRepository.findOne(id);
        if(tarea == null){
            return new ResponseEntity<Tarea>(HttpStatus.NOT_FOUND);
        }else{
            tarea.setNombre(requestTareaDTO.getNombre());
            tarea.setEstado(requestTareaDTO.getEstado());
            tarea.setDescripcion(requestTareaDTO.getDescripcion());
            tareaRepository.save(tarea);
            return new ResponseEntity<Tarea>(tarea, HttpStatus.OK);
        }
    }

    public void deleteTarea(String id) {
    }
}
