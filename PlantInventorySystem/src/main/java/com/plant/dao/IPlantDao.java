package com.plant.dao;

import java.util.List;

import com.plant.exceptions.PlantNotFoundException;
import com.plant.model.Plant;

public interface IPlantDao {
	
	void addPlant(Plant plant);
	int updatePlant(int plantId,String type);
	void deletePlant(int plantId);
	Plant findById(int plantId);
	List<Plant> findAllPlants();
	List<Plant> findByOrigin(String origin) throws PlantNotFoundException;
	List<Plant> findByOriginAndSpecies(String origin, String species) throws PlantNotFoundException;
	List<Plant> findByOriginAndPrice(String speciality, double price) throws PlantNotFoundException;

}



