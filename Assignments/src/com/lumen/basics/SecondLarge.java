package com.lumen.basics;

import java.util.Arrays;

public class SecondLarge {

	public static void main(String[] args) {
		
		int [] array=new int[] {25,11,12,4,34,54,59};
	      Arrays.sort(array);
	      int Largest=array[array.length-2];
	      System.out.println("Secondlargest number:"+Largest);


	}

}
