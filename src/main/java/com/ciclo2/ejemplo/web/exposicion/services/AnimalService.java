package com.ciclo2.ejemplo.web.exposicion.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciclo2.ejemplo.web.exposicion.dao.AnimalDao;
import com.ciclo2.ejemplo.web.exposicion.models.Animal;

@Service
public class AnimalService {

	@Autowired
	private AnimalDao animalRepo;

	public List<Animal> listar() {
		return animalRepo.findAll();
	}
	
	public List<Animal> especie() {
		return animalRepo.findAll();
	}
	
	public void guardar(Animal animal) {
		animalRepo.save(animal);
	}
	
	public void eliminar(Integer id) {
		animalRepo.deleteById(id);
	}
	
	public Animal encontrar(Integer id) {
		return animalRepo.findById(id).orElse(null);
	}

}
