package com.lumen.abs;

public class Bike extends Vehicle {
	
	public Bike(String model, String brand, double price) {
		super(model, brand, price);
	}

	@Override
	void getMileage() {
		System.out.println(model+""+"has this mileage");
	}

	@Override
	void showType() {
		System.out.println(model+""+""+"has this type");
	}

    void engineType() {
    	System.out.println("Electric");
    }
	

}
