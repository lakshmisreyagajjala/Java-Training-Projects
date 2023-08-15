package com.plant.service;

import java.util.List;

import com.plant.dao.PlantDaoImpl;
import com.plant.dao.IPlantDao;
import com.plant.exceptions.PlantNotFoundException;
import com.plant.model.Plant;

public class PlantServiceImpl implements IPlantService{
	
	IPlantDao plantService = new PlantDaoImpl();

	@Override
	public void addPlant(Plant plant) {
		plantService.addPlant(plant);		
	}

	@Override
	public int updatePlant(int plantId, String type) {
		int result = plantService.updatePlant(plantId, type);
		return result;
	}

	@Override
	public void deletePlant(int plantId) {
		plantService.deletePlant(plantId);
		
	}

	@Override
	public Plant getById(int plantId) {
		Plant plant= plantService.findById(plantId);
		if(plant==null)
			return null;
		return plant;	
	}

	@Override
	public List<Plant> getAllPlants()  {
		List<Plant> plants = plantService.findAllPlants();
		return plants;
	}

	@Override
	public List<Plant> getByOrigin(String origin) throws PlantNotFoundException {
		List<Plant> plants = plantService.findAllPlants();
		if(plants.isEmpty())
			throw new PlantNotFoundException("No such plant is found.");
		return plants;
	}

	@Override
	public List<Plant> getByOriginAndSpecies(String origin, String species) throws PlantNotFoundException {
		List<Plant> plants = plantService.findAllPlants();
		if(plants.isEmpty())
			throw new PlantNotFoundException("No such plant is found.");
		return plants;
	}

	@Override
	public List<Plant> getByOriginAndPrice(String speciality, double price) throws PlantNotFoundException {
		List<Plant> plants = plantService.findAllPlants();
		if(plants.isEmpty())
			throw new PlantNotFoundException("No such plant is found.");
		return plants;
	}

	
}
