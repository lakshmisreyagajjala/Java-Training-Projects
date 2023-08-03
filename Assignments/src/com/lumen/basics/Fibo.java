package com.lumen.basics;

public class Fibo {

	public static void main(String[] args) {
		
		int num1=0;
		int num2=1;
		int num3=0;
		int count=10,i;
		System.out.println(num1+"\n"+num2);
		
		for(i=2;i<count;i++) {
			num3 = num1 + num2;
			System.out.println(""+num3);
			num1 = num2;
			num2 = num3;
		}
		

	}

}
