package com.lumen.scan;

import java.util.Scanner;

public class ScEven {
	
public static void main(String[] args) {
		
		int num = 20;
		Scanner scanner = new Scanner(System.in);
		num=scanner.nextInt();
		System.out.println("Print even numbers from 1 to\t"+num+":");
		for(int i = 1; i<=num; i++) {
			if(i%2 == 0) {
				System.out.println(i+"");
			}
		}
	
       scanner.close();
}

}

