package com.encapsulation;

public class Account {
	private int id,balance;
	private long acnum;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setAcnum(long acnum)
	{
		this.acnum=acnum;
	}
	public long getAcnum()
	{
		return acnum;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;
	}
	public int getBalance()
	{
		return balance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
