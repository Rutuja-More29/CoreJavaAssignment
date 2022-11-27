package com.encapsulation;

public class BankAccount {
	private long accno;
	private String name,email;
	private float amount;
	public void setAccno(long accno)
	{
		this.accno=accno;
	}
	public long getAccno()
	{
		return accno;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public String getEmail()
	{
		return email;
	}
	public void setAmount(float amount)
	{
		this.amount=amount;
	}
	public float getAmount()
	{
		return amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
