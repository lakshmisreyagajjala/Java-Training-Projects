package com.lumen.fun;

public class FunMain {

	public static void main(String[] args) {
		
		ShapeFactory shape = new ShapeFactory();
		shape.printArea((double x, double y) -> {
			System.out.println(0.5*x*y);
		}, 20,10);
		
		shape.printArea((x,y)->{
			System.out.println(x*y);
		}, 20, 30);

	}

}
