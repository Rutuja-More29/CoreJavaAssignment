package com.containment;

public class Person1 {
	private String pname;
	private int age;
	private long contact;
	IdProof idp;
	

	public String getPname() {
		return pname;
	}


	public void setPname(String pname) {
		this.pname = pname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	public IdProof getIdp() {
		return idp;
	}


	public void setIdp(IdProof idp) {
		this.idp = idp;
	}
	public String toString()
	{
		return pname+" "+age+" "+contact+" "+idp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
