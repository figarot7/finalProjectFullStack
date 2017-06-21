package com.dh.project.finaltest.web;

import com.dh.project.finaltest.domain.AsignacionTarea;
import com.dh.project.finaltest.services.AsignacionTareaService;
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
@RequestMapping("/asignacionTareas")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Asignacion de Tareas")
public class AsignacionTareaController {
    @Autowired
    private AsignacionTareaService asignacionTareaService;

    @RequestMapping(method = RequestMethod.GET)
    public List<AsignacionTarea> getAllAsignacionTareas(){
        return  asignacionTareaService.getAllAsignacionTareas();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void createAsignacionTarea(@RequestBody RequestAsignacionTareaDTO  requestAsignacionTareaDTO){
        asignacionTareaService.createAsignacionTarea(requestAsignacionTareaDTO);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<AsignacionTarea> getAsignacionTareaById(@PathVariable String id){
        return asignacionTareaService.getAsignacionTareaById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<AsignacionTarea> updateAsignacionTarea(@RequestBody RequestAsignacionTareaDTO requestAsignacionTareaDTO, @PathVariable String id){
        return asignacionTareaService.updateAsignacionTarea(requestAsignacionTareaDTO, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteAsignacionTarea(@PathVariable String id){
        asignacionTareaService.deleteAsignacionTarea(id);
    }

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
