package com.dh.project.finaltest.services;

import com.dh.project.finaltest.domain.AsignacionTarea;
import com.dh.project.finaltest.repository.AsignacionTareaRepository;
import com.dh.project.finaltest.web.AsignacionTareaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by skypper on 17-06-17.
 */
@Service
public class AsignacionTareaService {
    @Autowired
    private AsignacionTareaRepository asignacionTareaRepository;

    public List<AsignacionTarea> getAllAsignacionTareas() {
        return null;
    }

    public void createAsignacionTarea(AsignacionTareaController.RequestAsignacionTareaDTO requestAsignacionTareaDTO) {
    }

    public ResponseEntity<AsignacionTarea> getAsignacionTareaById(String id) {
        return null;
    }

    public ResponseEntity<AsignacionTarea> updateAsignacionTarea(AsignacionTareaController.RequestAsignacionTareaDTO requestAsignacionTareaDTO, String id) {
        return null;
    }

    public void deleteAsignacionTarea(String id) {
    }
}
