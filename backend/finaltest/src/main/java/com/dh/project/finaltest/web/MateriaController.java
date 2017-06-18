package com.dh.project.finaltest.web;

import com.dh.project.finaltest.services.MateriaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skypper on 17-06-17.
 */
@RestController
@RequestMapping("/materias")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Materias")
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    public static class RequestMateriaDTO{

        private String codigo;
        private String nombre;
        private String grado;
        private String descripcion;

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getGrado() {
            return grado;
        }

        public void setGrado(String grado) {
            this.grado = grado;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
    }
}
