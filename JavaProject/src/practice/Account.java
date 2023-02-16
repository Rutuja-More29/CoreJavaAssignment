package practice;

import java.util.Scanner;

public class Account {
	int id;
	String name;
	long balance;
	Scanner sc = new Scanner(System.in);

	void openAccount() {
		System.out.println("Enter id");
		int id = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter balance");
		long balance = sc.nextLong();
	}
	void showDetail()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("balance:"+balance);
	}
	void deposite()
	{
		long amt;
		System.out.println("Enter the amount:");
		amt=sc.nextLong();
		balance=balance+amt;
	}
	public void withdrawal()
	{
		long amt;
		System.out.println("Enter to withdraw amount:");
		 amt=sc.nextLong();
		 if(balance>=amt)
		 {
			 balance=balance-amt;
			 System.out.println("after withdraw:"+balance);
		 }else
		 {
			 System.out.println("your balance is low:"+amt+" transaction fail");
		 }
		
	}
	

	public static void main(String[] args) {
		Account ac=new Account();
		ac.openAccount();
		ac.deposite();
		ac.withdrawal();
		
	}

}
