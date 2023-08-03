package com.lumen.basics;


public class Dupli {

	public static void main(String[] args) {
		
			int [] num = new int[] {1,2,3,4,2,7,8,8,3,4};
			System.out.println("Duplicates in an array:");
			
			for (int i = 0; i < num.length; i++) {
				for (int j = 1; j < num.length; j++) {
					if(num[i] == num[j]) {
						System.out.println(num[j]);
					}
					
				}
			}

	}

}
