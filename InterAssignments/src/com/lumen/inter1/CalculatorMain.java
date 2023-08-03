package com.lumen.inter1;


public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator addition = (x,y) -> System.out.println(x+y);
		Calculator subtraction = (x,y) -> System.out.println(x-y);
		Calculator multiplication = (x,y) -> System.out.println(x*y);	
		Calculator divide = (x,y) -> System.out.println(x/y);	
		
		addition.calculate(35,28);
		subtraction.calculate(35,28);
		multiplication.calculate(58,37);
		divide.calculate(58,37);

	}

}

