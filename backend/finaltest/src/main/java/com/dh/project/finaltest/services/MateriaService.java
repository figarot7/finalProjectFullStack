package com.dh.project.finaltest.services;

import com.dh.project.finaltest.repository.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by skypper on 17-06-17.
 */
@Service
public class MateriaService {
    @Autowired
    private MateriaRepository materiaRepository;
}
