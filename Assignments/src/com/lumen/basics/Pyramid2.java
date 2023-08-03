package com.lumen.basics;

public class Pyramid2 {

	public static void main(String[] args) {
		
		int i,j,k,rows=6;
		for (i = 0; i < rows-1; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("");
			}
		
			for(k = 1; k <= rows-1-i; k++) {
	            System.out.print("*"+"");
		    }
	        System.out.println();
		}

}

}

