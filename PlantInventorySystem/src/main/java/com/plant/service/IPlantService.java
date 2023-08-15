package com.plant.service;

import java.util.List;

import com.plant.exceptions.PlantNotFoundException;
import com.plant.model.Plant;

public interface IPlantService {
	
	void addPlant(Plant plant);
	int updatePlant(int plantId,String type);
	void deletePlant(int plantId);
	Plant getById(int plantId);
	List<Plant> getAllPlants();
	List<Plant> getByOrigin(String origin) throws PlantNotFoundException;
	List<Plant> getByOriginAndSpecies(String origin, String species) throws PlantNotFoundException;
	List<Plant> getByOriginAndPrice(String speciality, double price) throws PlantNotFoundException;

}


