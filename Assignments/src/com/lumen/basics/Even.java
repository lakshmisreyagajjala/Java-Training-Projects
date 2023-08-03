package com.lumen.basics;

public class Even {
	
	public static void main(String[] args) {
		
		int num = 20;
		System.out.println("Print even numbers from 1 to\t"+num+":");
		for(int i = 1; i<=num; i++) {
			if(i%2 == 0) {
				System.out.println(i+"");
			}
		}
	}

}
