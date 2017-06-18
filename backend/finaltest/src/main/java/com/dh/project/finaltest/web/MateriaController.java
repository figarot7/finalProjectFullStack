package com.dh.project.finaltest.web;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skypper on 17-06-17.
 */
@RestController
@RequestMapping("/materias")
@Api(value="Sistema de administración de estudiantes", description="Operaciones relacionadas a Materias")
public class MateriaController {
}
