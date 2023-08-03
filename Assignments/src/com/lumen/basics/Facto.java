package com.lumen.basics;

public class Facto {

	public static void main(String[] args) {
		
		int i=1, fact=1, num=5;
		while(i <= num) {
			fact = fact * i;
			i++;
		}
	System.out.println("Factorial of\t"+num+"\tis:\t"+fact);
		

}

}
