package com.ciclo2.ejemplo.web.exposicion.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciclo2.ejemplo.web.exposicion.models.Animal;

public interface AnimalDao extends JpaRepository<Animal,Integer> {

}
