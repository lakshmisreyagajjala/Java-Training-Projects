package com.lumen.abs;

public abstract class Vehicle {
	
	String model;
	String brand;
	double price;
	
	public Vehicle(String model, String brand, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
	}
	
	 abstract void getMileage();
	 abstract void showType();
	 
	 void printDetails() {
		 System.out.println("Model:"+model);
		 System.out.println("Brand:"+brand);
		 System.out.println("Price:"+price);
		 
	 }

}
