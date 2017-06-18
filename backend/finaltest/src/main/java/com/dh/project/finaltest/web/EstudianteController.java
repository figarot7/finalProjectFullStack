package com.dh.project.finaltest.web;

import com.dh.project.finaltest.services.EstudianteService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skypper on 17-06-17.
 */
@RestController
@RequestMapping("/estudiantes")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    public static class RequestEstudianteDTO{

        private String codigo;
        private String nombres;
        private String apellidos;
        private String email;
        private String telefono;
        private String direccion;

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }

        public String getNombres() {
            return nombres;
        }

        public void setNombres(String nombres) {
            this.nombres = nombres;
        }

        public String getApellidos() {
            return apellidos;
        }

        public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }
    }
}
