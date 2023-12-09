package com.ciclo2.ejemplo.web.exposicion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo2.ejemplo.web.exposicion.dao.EspecieDao;
import com.ciclo2.ejemplo.web.exposicion.models.EspecieAnimal;

@Service
public class EspecieAnimalService {
	
	@Autowired
    private EspecieDao especieDao;

    public List<EspecieAnimal> listar() {
        return especieDao.findAll();
    }

    public void guardar(EspecieAnimal especieAnimal) {
        especieDao.save(especieAnimal);
    }

    public void eliminar(Integer id) {
        especieDao.deleteById(id);
    }

    public EspecieAnimal encontrar(Integer id) {
        return especieDao.findById(id).orElse(null);
    }

}
