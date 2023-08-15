package com.plant.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.plant.util.DBConnection;
import com.plant.util.Queries;
import com.plant.model.Plant;
import com.plant.exceptions.PlantNotFoundException;

public class PlantDaoImpl implements IPlantDao {

	@Override
	public void addPlant(Plant plant) {
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.INSERTQUERY);) {
			preparedStatement.setString(1, plant.getPlantName());
			preparedStatement.setInt(2, plant.getPlantId());
			preparedStatement.setString(3, plant.getType());
			preparedStatement.setString(4, plant.getSpecies());
			preparedStatement.setString(5, plant.getOrigin());
			preparedStatement.setDouble(6, plant.getPrice());
			preparedStatement.execute();
			System.out.println("Plant added sucesfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public int updatePlant(int plantId, String type) {
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.UPDATEQUERY);) {
			preparedStatement.setString(1, type);
			preparedStatement.setInt(2, plantId);
			preparedStatement.execute();
			System.out.println("Plant updated sucesfully");

		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return plantId;
	}

	@Override
	public void deletePlant(int plantId) {
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.DELETEQUERY);) {
			preparedStatement.setInt(1, plantId);
			preparedStatement.execute();
			System.out.println("Plant with id " + plantId + " is deleted successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Plant findById(int plantId) {
		Plant plant = new Plant();
		try (Connection connection = DBConnection.openConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Queries.QUERYBYID);) {
			preparedStatement.setInt(1, plantId);
			try (ResultSet rt = preparedStatement.executeQuery();) {
				while (rt.next()) {

					String plantName = rt.getString("plantName");
					int plantId1 = rt.getInt("plantId");
					String  type= rt.getString("type");
					String species = rt.getString("species");
					String origin = rt.getString("origin");
					double price= rt.getDouble("price");
					plant.setPlantName(plantName);
					plant.setPlantId(plantId1);
					plant.setType(type);
					plant.setSpecies(species);
					plant.setOrigin(origin);
					plant.setPrice(price);
					System.out.println("Plant found sucesfully");
					System.out.println(plant.toString());
				}
				return plant;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Plant> findAllPlants() {
		List<Plant> plants = new ArrayList<>();
		try(Connection connection = DBConnection.openConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(Queries.GETALLQUERY);){
			System.out.println("Fetching all plants...");
			try(ResultSet resultSet = preparedStatement.executeQuery();){
				while (resultSet.next()) {
					String plantName = resultSet.getString("plantName");
					int plantId = resultSet.getInt("plantId");
					String type = resultSet.getString("type");
					String species = resultSet.getString("species");
					String origin = resultSet.getString("origin");
					double price =resultSet.getDouble("price");
					Plant plant = new Plant(plantName, plantId, type, species, origin, price);
					plants.add(plant);
					System.out.println(plant.toString());
			
				}}
			return plants;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Plant> findByOrigin(String origin) throws PlantNotFoundException {
		List<Plant> plants = new ArrayList<>();

		try (Connection connection = DBConnection.openConnection();
				PreparedStatement ps = connection.prepareStatement(Queries.QUERYBYORIGIN);) {

			ps.setString(1, origin);
			System.out.println("Getting plants with origin: " + origin);
			try (ResultSet rt = ps.executeQuery()) {
				while (rt.next()) {
					String plantName = rt.getString("plantName");
					int plantId = rt.getInt("plantId");
					String type = rt.getString("type");
					String species = rt.getString("species");
					String origin1 = rt.getString("origin");
					double price = rt.getDouble("price");
					Plant plant = new Plant(plantName, plantId, type, species, origin, price);
					plants.add(plant);
					System.out.println(plant.toString());
				}
			}
			return plants;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Plant> findByOriginAndSpecies(String origin, String species) throws PlantNotFoundException {
		List<Plant> plants = new ArrayList<>();

		try (Connection connection = DBConnection.openConnection();
				PreparedStatement ps = connection.prepareStatement(Queries.QUERYBYORIGINANDSPECIES);) {

			ps.setString(1, origin);
			ps.setString(2, species);
			System.out.println("Getting plants with origin- " + origin + " and with species-" + species);
			try (ResultSet rt = ps.executeQuery()) {
				while (rt.next()) {
					String plantName = rt.getString("plantName");
					int plantId = rt.getInt("plantId");
					String type = rt.getString("type");
					String species1 = rt.getString("species");
					String origin1 = rt.getString("origin");
					double price = rt.getDouble("price");
					Plant plant = new Plant(plantName, plantId, type, species1, origin1, price);
					plants.add(plant);
					System.out.println(plant.toString());
					
				}
			}
			return plants;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Plant> findByOriginAndPrice(String origin, double price) throws PlantNotFoundException {
		List<Plant> plants = new ArrayList<>();

		try (Connection connection = DBConnection.openConnection();
				PreparedStatement ps = connection.prepareStatement(Queries.QUERYBYORIGINANDPRICE);) {

			ps.setString(1, origin);
			ps.setDouble(2, price);
			System.out.println("Getting plants with origin-" + origin + " and with price-" + price);
			try (ResultSet rt = ps.executeQuery()) {
				while (rt.next()) {
					String plantName = rt.getString("plantName");
					int plantId = rt.getInt("plantId");
					String type = rt.getString("type");
					String species = rt.getString("species");
					String origin1 = rt.getString("origin");
					double price1 = rt.getDouble("price");
					Plant plant = new Plant(plantName, plantId, type, species, origin1, price1);
					plants.add(plant);
					System.out.println(plant.toString());
				}
			}
			return plants;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
