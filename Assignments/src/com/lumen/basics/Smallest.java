package com.lumen.basics;

public class Smallest {

	public static void main(String[] args) {
		
		int [] num = new int[] {10,5,35,28,94,38};
        int min = num[0];
        for(int i = 0; i<num.length; i++) {
        	if(num[i]<min) {
        		min = num[i];
        	}
        }
        System.out.println("Smallest element in an array:\t"+min);


	}

}
