package com.ciclo2.ejemplo.web.exposicion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciclo2.ejemplo.web.exposicion.models.EspecieAnimal;

public interface EspecieDao extends JpaRepository<EspecieAnimal, Integer> {
}
