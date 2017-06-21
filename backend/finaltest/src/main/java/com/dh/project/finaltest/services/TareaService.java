package com.dh.project.finaltest.services;

import com.dh.project.finaltest.domain.Tarea;
import com.dh.project.finaltest.repository.TareaRepository;
import com.dh.project.finaltest.web.TareaController;
import org.springframework.beans.factory.annotation.Autowired;
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
        return null;
    }

    public void createTarea(TareaController.RequestTareaDTO requestTareaDTO) {
    }

    public ResponseEntity<Tarea> getTareaById(String id) {
        return null;
    }

    public ResponseEntity<Tarea> updateTarea(TareaController.RequestTareaDTO requestTareaDTO, String id) {
        return null;
    }

    public void deleteTarea(String id) {
    }
}
