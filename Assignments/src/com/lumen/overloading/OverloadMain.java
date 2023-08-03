package com.lumen.overloading;

public class OverloadMain {

	public static void main(String[] args) {
		
		Employee programmer = new Employee("bhavya", "se");
		Employee manager = new Employee("akhila", "hr");
		Employee director = new Employee("sushmi", "senior");
		
		System.out.println("programmer bonus "+programmer.calcBonus(30000));
		System.out.println("manager bonus "+manager.calcBonus(352846, 40000));
		System.out.println("director bonus "+director.calcBonus(2743434, 121210, 121210));


	}

}
