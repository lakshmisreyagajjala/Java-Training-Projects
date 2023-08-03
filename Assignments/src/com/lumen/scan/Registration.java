package com.lumen.scan;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		
		String[] usernames= {"sush","keerthi","akhi","vinee"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.next();
		System.out.println(name);
		int count=1;
		for(int i=0;i<usernames.length;i++) {
			if(usernames[i].equals(name)) {
				System.out.println("Your name is not unique");
				count=0;
				break;
			}
		
		}
		if(count==1)
		System.out.println("you are registered");
		scanner.close();
	 }

}
