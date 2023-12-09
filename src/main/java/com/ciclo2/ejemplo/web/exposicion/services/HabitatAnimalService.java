package com.ciclo2.ejemplo.web.exposicion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo2.ejemplo.web.exposicion.dao.HabitatDao;
import com.ciclo2.ejemplo.web.exposicion.models.HabitatAnimal;

@Service
public class HabitatAnimalService {
	
    @Autowired
    private HabitatDao habitatDao;

    public List<HabitatAnimal> listar() {
        return habitatDao.findAll();
    }

    public void guardar(HabitatAnimal habitatAnimal) {
        habitatDao.save(habitatAnimal);
    }

    public void eliminar(Integer id) {
        habitatDao.deleteById(id);
    }

    public HabitatAnimal encontrar(Integer id) {
        return habitatDao.findById(id).orElse(null);
    }
}

