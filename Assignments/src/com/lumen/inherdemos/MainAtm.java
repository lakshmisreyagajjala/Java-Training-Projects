package com.lumen.inherdemos;

import java.util.Scanner;

public class MainAtm {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter account type");
		String accountType = scanner.next();
		System.out.println("enter  methodtype");
		String methodType = scanner.next();
		System.out.println("enter amount you save");
		double balance1 = scanner.nextInt();
		System.out.println("take your amounts");
		double money = scanner.nextInt();

		if (accountType.equals("savings")) {
			if (methodType.equals("withdraw")) {
				Account account = new AccountSavings(balance1);
				account.withdraw(money);
				System.out.println("available balance " + account.getBalance());
			} else {
				Account account = new AccountSavings(balance1);
				account.deposit(money);
			}
		} else if (accountType.equals("current")) {
			if (methodType.equals("withdraw")) {
				Account account = new AccountSavings(balance1);
				account.withdraw(money);

			} else {
				Account account = new AccountSavings(balance1);
				account.deposit(money);

			}
			scanner.close();
		}

	}

}
