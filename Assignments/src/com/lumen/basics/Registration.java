package com.lumen.basics;
import java.util.Scanner;
public class Registration {

	public static void main(String[] args) {
		
				String username[]={"apple","boy","cat","dog","eagle"};
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter your username");
				String uname = scanner.nextLine();
				int count=0;
				for (String s : username) {
					if (s.equals(uname)) {
						System.out.println("Name is not unique");
						count=1;
						break;
					
					}
				}
				if(count==0) {
					System.out.println("You are registered");
				}
	        
	
}
}
