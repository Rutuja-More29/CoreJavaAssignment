package com.assignment;

public class IdProof extends Person1 {
	String name;
	int validity;
	long number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
		this.validity = validity;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	void display()
	{
		if(idproof=="adhar card"&& address=="pune")
		{
			super.display();
			System.out.println(name+" "+number+" "+validity);
		}
		else
		{
			System.out.println("Enter valid Id");
		}
	}
}
