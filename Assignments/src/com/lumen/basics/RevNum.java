package com.lumen.basics;

public class RevNum {

	public static void main(String[] args) {
		
		int [] num = new int[] {5,2,8,1,0};
		System.out.println("Given array");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]+"");
		}
		System.out.println("Reverse order");
		for (int i = num.length-1; i >= 0; i--) {
			System.out.println(num[i]+"");
		}

	}

}
