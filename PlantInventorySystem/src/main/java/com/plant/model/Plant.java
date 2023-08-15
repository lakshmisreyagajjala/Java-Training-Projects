package com.plant.model;

public class Plant {
	
	private String plantName;
	private int plantId;
	private String type;
	private String species;
	private String origin;
	private double price;
	public Plant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Plant(String plantName, int plantId, String type, String species, String origin, double price) {
		super();
		this.plantName = plantName;
		this.plantId = plantId;
		this.type = type;
		this.species = species;
		this.origin = origin;
		this.price = price;
	}
	public String getPlantName() {
		return plantName;
	}
	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}
	public int getPlantId() {
		return plantId;
	}
	public void setPlantId(int plantId) {
		this.plantId = plantId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Plant [plantName=" + plantName + ", plantId=" + plantId + ", type=" + type + ", species=" + species
				+ ", origin=" + origin + ", price=" + price + "]";
	}
	
}
