package com.plant.client;

import java.util.Scanner;

import com.plant.exceptions.PlantNotFoundException;
import com.plant.model.Plant;
import com.plant.service.PlantServiceImpl;
import com.plant.service.IPlantService;

public class PlantMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		IPlantService plantService = new PlantServiceImpl();
		System.out.println("Welcome to Plant Inventory System! Please choose the below operations to perform: ");
		System.out.println(
				"1. Add Plant \n 2. Update Plant \n 3. Delete Plant By Id \n 4. Get Plant By Id \n 5. Get All Plants \n 6. Get Plant By Origin \n 7. Get Plant By Origin And By Species \n 8. Get Plant By Origin And By Price");
		int choice = scanner.nextInt();
		if (choice == 1) {
			scanner.nextLine();
			System.out.println("Enter name: ");
			String name = scanner.nextLine();
			System.out.println();
			System.out.println("Enter plantId: ");
			int plantId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter type: ");
			String type = scanner.nextLine();
			System.out.println();
			System.out.println("Enter species: ");
			String species = scanner.nextLine();
			System.out.println();
			System.out.println("Enter origin: ");
			String origin = scanner.nextLine();
			System.out.println();
			System.out.println("Enter price: ");
			Double price = scanner.nextDouble();
			Plant plant = new Plant(name, plantId, type, species, origin, price);
			plantService.addPlant(plant);
		} else if (choice == 2) {
			System.out.println("Enter plant Id: ");
			int plantId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter new type: ");
			String type = scanner.nextLine();
			plantService.updatePlant(plantId, type);
		} else if (choice==3) {
			System.out.println("Enter plant Id: ");
			int plantId = scanner.nextInt();
			plantService.deletePlant(plantId);
		} else if (choice==4) {
			System.out.println("Enter plant Id: ");
			int plantId=scanner.nextInt();
			plantService.getById(plantId);	
		} else if (choice==5) {
				plantService.getAllPlants();	
			
		} else if (choice==6) {
			scanner.nextLine();
			System.out.println("Enter plant origin: ");
			String origin = scanner.nextLine();
			try {
				plantService.getByOrigin(origin);
			} catch (PlantNotFoundException e) {
				e.printStackTrace();
			}
		} else if (choice==7) {
			scanner.nextLine();
			System.out.println("Enter plant origin: ");
			String origin = scanner.nextLine();
			System.out.println("Enter plant species: ");
			String species = scanner.nextLine();
			try {
				plantService.getByOriginAndSpecies(origin, species);
				
			} catch (PlantNotFoundException e) {
				e.printStackTrace();
			}
			
		} else {
			scanner.nextLine();
			System.out.println("Enter plant origin: ");
			String origin = scanner.nextLine();
			System.out.println("Enter plant price: ");
			double price = scanner.nextDouble();
			try {
				plantService.getByOriginAndPrice(origin, price);
			} catch (PlantNotFoundException e) {
				e.printStackTrace();
			}
		}


	}


}


