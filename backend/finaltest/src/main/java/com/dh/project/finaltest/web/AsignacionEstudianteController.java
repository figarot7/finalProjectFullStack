package com.dh.project.finaltest.web;

import com.dh.project.finaltest.domain.AsignacionEstudiante;
import com.dh.project.finaltest.services.AsignacionEstudianteService;
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
@RequestMapping("/asignacionEstudiantes")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Asignacion de Estudiantes")
public class AsignacionEstudianteController {
    @Autowired
    private AsignacionEstudianteService asignacionEstudianteService;

    @RequestMapping(method = RequestMethod.GET)
    public List<AsignacionEstudiante> getAllAsignacionEstudiantes(){
        return  asignacionEstudianteService.getAllAsignacionEstudiantes();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void createAsignacionEstudiante(@RequestBody RequestAsignacionEstudianteDTO  requestAsignacionEstudianteDTO){
        asignacionEstudianteService.createAsignacionEstudiante(requestAsignacionEstudianteDTO);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<AsignacionEstudiante> getAsignacionEstudianteById(@PathVariable String id){
        return asignacionEstudianteService.getAsignacionEstudianteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<AsignacionEstudiante> updateAsignacionEstudiante(@RequestBody RequestAsignacionEstudianteDTO requestAsignacionEstudianteDTO, @PathVariable String id){
        return asignacionEstudianteService.updateAsignacionEstudiante(requestAsignacionEstudianteDTO, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteAsignacionEstudiante(@PathVariable String id){
        asignacionEstudianteService.deleteAsignacionEstudiante(id);
    }

    public static class RequestAsignacionEstudianteDTO{

        private String estudianteId;
        private String materiaId;
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

        public Date getFechaAsignacion() {
            return fechaAsignacion;
        }

        public void setFechaAsignacion(Date fechaAsignacion) {
            this.fechaAsignacion = fechaAsignacion;
        }
    }
}
