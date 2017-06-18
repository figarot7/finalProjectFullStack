package com.dh.project.finaltest.web;

import com.dh.project.finaltest.services.AsignacionTareaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by skypper on 17-06-17.
 */
@RestController
@RequestMapping("/asignacionTareas")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Asignacion de Tareas")
public class AsignacionTareaController {
    @Autowired
    private AsignacionTareaService asignacionTareaService;

    public static class RequestAsignacionTareaDTO{

        private String estudianteId;
        private String materiaId;
        private String tareaId;
        private Date fechaAsignacion;

        public String getEstudianteId() {
            return estudianteId;
        }

        public void setEstudianteId(String estudianteId) {
            this.estudianteId = estudianteId;
        }

        public String getMateriaId() {
            return materiaId;
        }

        public void setMateriaId(String materiaId) {
            this.materiaId = materiaId;
        }

        public String getTareaId() {
            return tareaId;
        }

        public void setTareaId(String tareaId) {
            this.tareaId = tareaId;
        }

        public Date getFechaAsignacion() {
            return fechaAsignacion;
        }

        public void setFechaAsignacion(Date fechaAsignacion) {
            this.fechaAsignacion = fechaAsignacion;
        }
    }
}
