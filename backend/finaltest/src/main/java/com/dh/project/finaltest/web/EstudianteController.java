package com.dh.project.finaltest.web;

import com.dh.project.finaltest.domain.Estudiante;
import com.dh.project.finaltest.services.EstudianteService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by skypper on 17-06-17.
 */
@RestController
@RequestMapping("/estudiantes")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Estudiante> getAllEstudiantes(){
        return  estudianteService.getAllEstudiantes();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void createEstudiante(@RequestBody RequestEstudianteDTO  requestEstudianteDTO){
        estudianteService.createEstudiante(requestEstudianteDTO);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Estudiante> getEstudianteById(@PathVariable String id){
        return estudianteService.getEstudianteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<Estudiante> updateEstudiante(@RequestBody RequestEstudianteDTO requestEstudianteDTO, @PathVariable String id){
        return estudianteService.updateEstudiante(requestEstudianteDTO, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteEstudiante(@PathVariable String id){
        estudianteService.deleteEstudiante(id);
    }

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
