package com.lumen.scan;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
		String word = scanner.nextLine();
		String palWord ="";
		
		for (int i = word.length()-1; i >=0; i--) {
			palWord += word.charAt(i);
		}
		
		if(palWord.equals(word)) {
			System.out.println(word+" is a plaindrome");
		} else {
			System.out.println(word+" is not a plaindrome");
		}
		
		
		scanner.close();

	}

}
