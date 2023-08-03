package com.lumen.absdemos;

public class AccountSavings extends Bank {

	public AccountSavings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if (amount >= 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw Successful from Your Savings Account.");

		} else {
			System.out.println("Insufficient balance in your Savings Account");
		}
	}

	@Override
	void deposit(double amount) {
		if (amount >= 0) {
			balance += amount;
			System.out.println("Deposit Successful from Savings Account");
		} else {
			System.out.println("Invalid amount.");
		}
	}

}
