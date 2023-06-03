package com.spring.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.backend.models.Tarea;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer>{

}
