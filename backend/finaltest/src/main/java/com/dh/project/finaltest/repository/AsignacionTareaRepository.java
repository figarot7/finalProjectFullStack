package com.dh.project.finaltest.repository;

import com.dh.project.finaltest.domain.AsignacionTarea;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by skypper on 17-06-17.
 */
public interface AsignacionTareaRepository extends MongoRepository<AsignacionTarea, String> {
}
