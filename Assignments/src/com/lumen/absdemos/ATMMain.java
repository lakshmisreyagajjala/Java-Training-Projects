package com.lumen.absdemos;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Account type Savings or Current [s/c] : ");
		String accountType = scanner.next();
		
		System.out.print("Do you want to Withdraw or Deposit [w/d] : ");
		String accountAction = scanner.next();
		
		System.out.print("Enter amount : ");
		double amount = scanner.nextDouble();
		
		if(accountType.equals("savings") | accountType.equals("s")) {
			Bank bank = new AccountSavings(10_000.0);
			AccountSavings savings = (AccountSavings) bank;
			if(accountAction.toLowerCase().equals("withdraw") | accountAction.toLowerCase().equals("w")) {
				savings.withdraw(amount);
				double balance = savings.getBalance();
				System.out.println("Savings Account Balance after Withdraw : " + balance);
			} else {
				savings.deposit(amount);
				double balance = savings.getBalance();
				System.out.println("Savings Account Balance after deposit : " + balance);
			}
		} else if(accountType.toLowerCase().equals("current") | accountType.toLowerCase().equals("c")){
			Bank bank = new AccountCurrent(10_000.0);
			AccountCurrent current = (AccountCurrent) bank;
			if(accountAction.toLowerCase().equals("withdraw") | accountAction.toLowerCase().equals("w")) {
				current.withdraw(amount);
				double balance = current.getBalance();
				System.out.println("Current Account Balance after Withdrw : " + balance);
			} else {
				current.deposit(amount);
				double balance = current.getBalance();
				System.out.println("Current Account Balance after deposit : " + balance);
			}
		}
		
		
		
		
		scanner.close();
	}

	
}
