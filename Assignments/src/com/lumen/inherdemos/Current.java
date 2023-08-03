package com.lumen.inherdemos;

public class Current extends Account{

	public Current(double balance) {
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
			System.out.println("insufficent ");
		}
	}
	

	@Override
	void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("deposited success");
		}
		else {
			System.out.println("invalid");
		}
		
		}

}

	
	
	


