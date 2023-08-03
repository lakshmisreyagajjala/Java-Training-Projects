package com.lumen.inter2;

public class SciCalculatorImpl implements BasicCalculator, ScientificCalculator{

	@Override
	public void square(int x) {
		System.out.println("square "+(x*x));
		
	}

	@Override
	public void cube(int x) {
		System.out.println("Cube "+(x*x*x));
		
	}

	@Override
	public void add(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void difference(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void product(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void divide(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	
}
