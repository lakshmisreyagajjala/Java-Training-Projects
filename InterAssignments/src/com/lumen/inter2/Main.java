package com.lumen.inter2;

public class Main {

	public static void main(String[] args) {
		
		 
		Basic calc = new Basic();
		calc.add(35,28);
		calc.difference(58,37);
		calc.product(10,35);
		calc.divide(46,28);
		
		
		SciCalculatorImpl scientific = new SciCalculatorImpl();
		scientific.square(35);
		scientific.cube(28);
		
		

	}

}


