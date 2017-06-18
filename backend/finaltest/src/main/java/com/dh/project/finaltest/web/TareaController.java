package com.dh.project.finaltest.web;

import com.dh.project.finaltest.services.TareaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skypper on 17-06-17.
 */
@RestController
@RequestMapping("/tareas")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Tareas")
public class TareaController {
    @Autowired
    private TareaService tareaService;

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
