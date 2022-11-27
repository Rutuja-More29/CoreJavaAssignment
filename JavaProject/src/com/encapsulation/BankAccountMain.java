package com.encapsulation;

public class BankAccountMain {

	public static void main(String[] args) {
		
		BankAccount ac=new BankAccount();
		ac.setAccno(2022775643);
		ac.setName("aaa");
		ac.setEmail("ab24@gmail.com");
		ac.setAmount(4500);
		System.out.println(ac.getAccno()+" "+ac.getName()+" "+ac.getEmail()+" "+ac.getAmount());
		
	}

}
