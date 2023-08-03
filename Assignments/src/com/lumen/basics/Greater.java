package com.lumen.basics;

public class Greater {

	public static void main(String[] args) {
			
	        int [] num = new int[] {10,35,28,94,38};
	        int max = 0;
	        for(int i = 0; i<num.length; i++) {
	        	if(num[i]>max) {
	        		max = num[i];
	        	}
	        }
	        System.out.println("Greatest element in an array:\t"+max);

}
}