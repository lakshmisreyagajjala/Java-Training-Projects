package com.lumen.scan;

import java.util.Scanner;

public class Longest {

	public static void main(String[] args) {
		
       
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=scanner.nextInt();
		System.out.println("Enter the second number");
		int b=scanner.nextInt();
		System.out.println("Enter the third number");
		int c=scanner.nextInt();
		scanner.close();
		
		int greaternumber = a>b ? (a>c ? a:c) : (b>c ? b:c);
		
       
	    System.out.println("\nLargest = "+greaternumber);
	
	}

}

