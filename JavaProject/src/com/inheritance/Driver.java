package com.inheritance;
// containment-composition
public class Driver {
		
	 private int id,dcontact;
	private String dname;
	Driver(int id,String dname,int dcontact)
	{
		this.id=id;
		this.dname=dname;
		this.dcontact=dcontact;
	}
	public String toString()
	{
		return id+" "+dname+" "+dcontact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
