package com.dh.project.finaltest.web;

import com.dh.project.finaltest.services.AsignacionDocenteService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by skypper on 17-06-17.
 */
@RestController
@RequestMapping("/asignacionDocentes")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Asignacion de Docentes")
public class AsignacionDocenteController {
    @Autowired
    private AsignacionDocenteService asignacionDocenteService;

    public static class RequestAsignacionDocenteDTO{

        private String docenteId;
        private String materiaId;
        private Date fechaAsignacion;

        public String getDocenteId() {
            return docenteId;
        }

        public void setDocenteId(String docenteId) {
            this.docenteId = docenteId;
        }

        public String getMateriaId() {
            return materiaId;
        }

        public void setMateriaId(String materiaId) {
            this.materiaId = materiaId;
        }

        public Date getFechaAsignacion() {
            return fechaAsignacion;
        }

        public void setFechaAsignacion(Date fechaAsignacion) {
            this.fechaAsignacion = fechaAsignacion;
        }
    }
}
