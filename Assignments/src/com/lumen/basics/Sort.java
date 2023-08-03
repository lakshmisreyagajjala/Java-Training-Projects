package com.lumen.basics;


public class Sort {

	public static void main(String[] args) {
		
			int [] num = new int[] {5,2,8,5,3};
			int temp = 0;
			System.out.println("Given array");
			for (int i = 0; i < num.length; i++) {
				System.out.println(num[i]+"");
			}
            for (int i = 0; i < num.length; i++) {
            	for (int j = i+1; j < num.length; j++) {
            		if(num[i]>num[j]) {
            			temp = num[i];
            			num[i] = num[j];
            			num[j] = temp;
            		}
					
				}
				
			}
            
            System.out.println();
            
            System.out.println("Sorted in ascending order");
            for (int i = 0; i < num.length; i++) {
				System.out.println(num[i]+"");
			}
	}

}
