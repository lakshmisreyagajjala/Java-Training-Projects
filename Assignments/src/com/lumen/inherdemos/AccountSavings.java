package com.lumen.inherdemos;

public class AccountSavings extends Account{

	public AccountSavings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			if(getBalance()-amount>=1000)
				balance=balance-amount;
			System.out.println("withdraw success");
		}
		else {
			System.out.println("insufficent balances");
		}
			}
	

	@Override
	void deposit(double amount) {

		if(amount>0) {
			balance=balance+amount;
			System.out.println("deposited successful");
		}
		else {
			System.out.println("invalid");
		}
	}
	
	
	
	
}	


