package com.encapsulation;

import java.util.Scanner;

public class GooglePay {
	

	public void withdraw(int amount, Account acc) // passing object as parameter
	{
		int accbal = acc.getBalance();
		if (accbal > amount) {
			accbal = accbal - amount;
			acc.setBalance(accbal);
		} else
			System.out.println("Low Balance...try after sometime");
	}
	public void deposite(int amount,Account acc2)
	{
		int accountbal=acc2.getBalance();
		accountbal=accountbal+amount;
		acc2.setBalance(accountbal);
	}

	
		public static void main(String[] args) {
			Account a1 = new Account();
			a1.setId(111);
			a1.setAcnum(2022747565);
			a1.setBalance(54000);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount to withdraw: ");
			int amt = sc.nextInt();
			GooglePay gp = new GooglePay();
			gp.withdraw(amt, a1);
			System.out.println("Amount withdraw; Total Balance:" + a1.getBalance());
			
			Account a2=new Account();
			a2.setId(112);
			a2.setAcnum(2022747560);
			a2.setBalance(5400);
			System.out.println("Enter deposite amount:");
			int amount=sc.nextInt();
			gp.deposite(amount, a2);
			System.out.println("Amount deposited; Total Balance:"+a2.getBalance());

		}

	}

