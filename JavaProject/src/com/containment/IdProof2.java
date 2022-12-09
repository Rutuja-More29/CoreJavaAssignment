package com.containment;

public class IdProof2 {
	private String name,address;
	private int number;
	IdProof2(String name,int number,String address)
	{
		this.name=name;
		this.number=number;
		this.address=address;
	}
	public String toString()
	{
		return name+" "+number+" "+address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
