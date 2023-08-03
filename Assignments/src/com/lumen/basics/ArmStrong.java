package com.lumen.basics;


public class ArmStrong {

	public static void main(String[] args) {
		
		int num=153, n, remainder, result=0;
		n = num;
		
		while(n!=0) {
			remainder = n%10;
			result += Math.pow(remainder,3);
			n /=10;
		}
		if(result == num) {
			System.out.println(num + "\tis an Armstrong number");
		}
		else {
			System.out.println(num + "\tis not an Armstrong number");
		}
		
}
		

}


