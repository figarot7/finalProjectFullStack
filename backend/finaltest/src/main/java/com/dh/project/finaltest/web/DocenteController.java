package com.dh.project.finaltest.web;

import com.dh.project.finaltest.domain.Docente;
import com.dh.project.finaltest.services.DocenteService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by skypper on 17-06-17.
 */
@RestController
@RequestMapping("/docentes")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Docentes")
public class DocenteController {
    @Autowired
    private DocenteService docenteService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Docente> getAllDocentes(){
        return  docenteService.getAllDocentes();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void createDocente(@RequestBody RequestDocenteDTO  requestDocenteDTO){
        docenteService.createDocente(requestDocenteDTO);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Docente> getDocenteById(@PathVariable String id){
        return docenteService.getDocenteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<Docente> updateDocente(@RequestBody RequestDocenteDTO requestDocenteDTO, @PathVariable String id){
        return docenteService.updateDocente(requestDocenteDTO, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteDocente(@PathVariable String id){
        docenteService.deleteDocente(id);
    }

    public static class RequestDocenteDTO{

        private String codigo;
        private String nombres;
        private String apellidos;
        private String email;
        private String telefono;
        private String direccion;
        private Double salario;

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

        public Double getSalario() {
            return salario;
        }

        public void setSalario(Double salario) {
            this.salario = salario;
        }
    }
}
