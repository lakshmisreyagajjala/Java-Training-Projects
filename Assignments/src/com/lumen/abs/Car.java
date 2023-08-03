package com.lumen.abs;

public class Car extends Vehicle{
	

	public Car(String model, String brand, double price) {
		super(model, brand, price);
	}

	@Override
	void getMileage() {
		System.out.println(model+"car"+"has this mileage");
	}

	@Override
	void showType() {
		System.out.println(model+"car"+"has this type");
		
	}
	
	void showAccessories(String [] carAccess) {
		for(String item : carAccess) {
			System.out.println(item);
		}
	}

}
