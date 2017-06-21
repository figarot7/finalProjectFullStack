package com.dh.project.finaltest.web;

import com.dh.project.finaltest.domain.Materia;
import com.dh.project.finaltest.services.MateriaService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by skypper on 17-06-17.
 */
@RestController
@RequestMapping("/materias")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Materias")
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Materia> getAllMaterias(){
        return  materiaService.getAllMaterias();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void createMateria(@RequestBody RequestMateriaDTO  requestMateriaDTO){
        materiaService.createMateria(requestMateriaDTO);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Materia> getMateriaById(@PathVariable String id){
        return materiaService.getMateriaById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public ResponseEntity<Materia> updateMateria(@RequestBody RequestMateriaDTO requestMateriaDTO, @PathVariable String id){
        return materiaService.updateMateria(requestMateriaDTO, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteMateria(@PathVariable String id){
        materiaService.deleteMateria(id);
    }

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
