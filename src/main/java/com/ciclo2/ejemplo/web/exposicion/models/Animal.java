package com.ciclo2.ejemplo.web.exposicion.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "animales")

public class Animal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nombre;

	@OneToOne
	@JoinColumn(name="especie_animal_id")
	private EspecieAnimal especieAnimal;
	
	
	@OneToOne
	@JoinColumn(name="habitat_animal_id")
	private HabitatAnimal habitatAnimal;

	public Animal() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public HabitatAnimal getHabitatAnimal() {
		return habitatAnimal;
	}

	public void setHabitatAnimal(HabitatAnimal habitatAnimal) {
		this.habitatAnimal = habitatAnimal;
	}

	public EspecieAnimal getEspecieAnimal() {
		return especieAnimal;
	}

	public void setEspecieAnimal(EspecieAnimal especieAnimal) {
		this.especieAnimal = especieAnimal;
	}
		

}
