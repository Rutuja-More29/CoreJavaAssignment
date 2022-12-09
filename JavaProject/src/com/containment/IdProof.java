package com.containment;

public class IdProof {
	private String name,address;
	private int number;
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	public String toString()
	{
		return name+" "+address+" "+number;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
