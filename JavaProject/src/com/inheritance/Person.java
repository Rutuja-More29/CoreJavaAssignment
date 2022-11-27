package com.inheritance;

public class Person {
	private int id,contact;
	String name,email;
	Address a;
	Person(int id,String name,String email,int contact,Address a)
	{
		this.id=id;
		this.name=name;
		this.email=email;
		this.contact=contact;
		this.a=a;
	}
	public String toString()
	{
		return id+" "+name+" "+email+" "+contact+" "+a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
