package com.lumen.fun;

public class ShapeFactory {
	
	void printArea(Shape shape, double x, double y) {
		System.out.println("Printing Area");
		shape.CalcArea(x, y);
		System.out.println("Area");
	}

}
