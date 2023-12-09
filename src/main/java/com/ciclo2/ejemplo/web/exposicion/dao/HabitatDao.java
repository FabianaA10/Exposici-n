package com.ciclo2.ejemplo.web.exposicion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciclo2.ejemplo.web.exposicion.models.HabitatAnimal;

public interface HabitatDao extends JpaRepository<HabitatAnimal,Integer> {

}
