package com.lumen.absdemos;

public class AccountCurrent extends Bank {

	public AccountCurrent(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if (amount >= 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdraw Successful from Your Current Account.");

		} else {
			System.out.println("Insufficient balance in your Current Account");
		}
	}

	@Override
	void deposit(double amount) {
		if (amount >= 0) {
			balance += amount;
			System.out.println("Deposit Successful from Current Account");
		} else {
			System.out.println("Invalid amount.");
		}
	}

}
