package com.lumen.scan;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		
		String[] usernames= {"sami","sasi","sanju","sallu"};
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scanner.next();
		System.out.println(name);
		int count=1;
		for(int i=0;i<usernames.length;i++) {
			if(usernames[i].equals(name)) {
				count=0;
				System.out.println("your register is successfully");
				count=0;
				break;
			}
		
		}
		if(count==1)
		System.out.println("you are not registered successfully");
      
           scanner.close();

	}

}
