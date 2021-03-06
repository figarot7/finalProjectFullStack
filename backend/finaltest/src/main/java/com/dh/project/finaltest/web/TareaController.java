package com.dh.project.finaltest.web;

import com.dh.project.finaltest.domain.Tarea;
import com.dh.project.finaltest.services.TareaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by skypper on 17-06-17.
 */
@RestController
@RequestMapping("/tareas")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Tareas")
public class TareaController {
    @Autowired
    private TareaService tareaService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Tarea> getAllTareas(){
        return  tareaService.getAllTareas();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void createTarea(@RequestBody RequestTareaDTO  requestTareaDTO){
        tareaService.createTarea(requestTareaDTO);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Tarea> getTareaById(@PathVariable String id){
        return tareaService.getTareaById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<Tarea> updateTarea(@RequestBody RequestTareaDTO requestTareaDTO, @PathVariable String id){
        return tareaService.updateTarea(requestTareaDTO, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteTarea(@PathVariable String id){
        tareaService.deleteTarea(id);
    }

    public static class RequestTareaDTO{

        private String nombre;
        private String estado;
        private String descripcion;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    }
}
