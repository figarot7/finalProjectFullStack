package com.dh.project.finaltest.web;

import com.dh.project.finaltest.domain.AsignacionDocente;
import com.dh.project.finaltest.services.AsignacionDocenteService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by skypper on 17-06-17.
 */
@RestController
@RequestMapping("/asignacionDocentes")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Asignacion de Docentes")
public class AsignacionDocenteController {
    @Autowired
    private AsignacionDocenteService asignacionDocenteService;

    @RequestMapping(method = RequestMethod.GET)
    public List<AsignacionDocente> getAllAsignacionDocentes(){
        return  asignacionDocenteService.getAllAsignacionDocentes();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void createAsignacionDocente(@RequestBody RequestAsignacionDocenteDTO  requestAsignacionDocenteDTO){
        asignacionDocenteService.createAsignacionDocente(requestAsignacionDocenteDTO);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<AsignacionDocente> getAsignacionDocenteById(@PathVariable String id){
        return asignacionDocenteService.getAsignacionDocenteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<AsignacionDocente> updateAsignacionDocente(@RequestBody RequestAsignacionDocenteDTO requestAsignacionDocenteDTO, @PathVariable String id){
        return asignacionDocenteService.updateAsignacionDocente(requestAsignacionDocenteDTO, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteAsignacionDocente(@PathVariable String id){
        asignacionDocenteService.deleteAsignacionDocente(id);
    }

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
