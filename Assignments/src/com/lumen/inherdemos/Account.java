package com.lumen.inherdemos;

public class Account {

	double balance;

	public Account(double balance) {
		this.balance = balance;

	}

	void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println(balance);

		} else {
			System.out.println("insuffiecient amount");
		}

	}

	void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("deposited successfully");
		} else {
			System.out.println("invalid");
		}
	}

	double getBalance() {
		return balance;
	}
}
