package com.lumen.basics;


public class Perfect {

	public static void main(String[] args) {
		
		int num=3, sum=0;
		
		int i = 1;
		while(i <= num/2) {
			if(num % i ==0) {
				sum = sum + i;
			}
			i++;
		}
		if(sum == num) {
			System.out.println(num + " is a perfect number");
		}
		else {
			System.out.println(num + " is not a perfect number");
		}

	}

}
