package com.lumen.scan;

import java.util.Scanner;

public class OneDimArray {
	
	public static void main(String[] args) {
		int num, sum = 0;
        int average;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        num= scanner.nextInt();
        int a[] = new int[num];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < num ; i++)
        {
            a[i] = scanner.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = sum / num;
        System.out.println("Average:"+average);	
	    scanner.close();
	}

}
