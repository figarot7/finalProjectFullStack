package com.dh.project.finaltest.services;

import com.dh.project.finaltest.repository.AsignacionDocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by skypper on 17-06-17.
 */
@Service
public class AsignacionDocenteService {
    @Autowired
    private AsignacionDocenteRepository asignacionDocenteRepository;
}
