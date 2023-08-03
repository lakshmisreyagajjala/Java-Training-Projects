package com.lumen.basics;

public class SumAvg {

	public static void main(String[] args) {
		
		int num[] = {10,35,28,94,38,80,31};
		int sum = 0;
		 
		for(int i = 0; i<num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("Sum of elements are:"+sum);
		float avg = (sum/num.length);
		System.out.println("Average of elements are:"+avg);

	}

}
