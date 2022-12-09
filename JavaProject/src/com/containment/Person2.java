package com.containment;

public class Person2 {
	private String pname;
	private int age;
	private long contact;
	IdProof2 idp2;
	Person2(String name,int age,long contact,IdProof2 idp2)
	{
		this.pname=pname;
		this.age=age;
		this.contact=contact;
		this.idp2=idp2;
	}
	public String toString()
	{
		return pname+" "+age+" "+contact+" "+idp2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
