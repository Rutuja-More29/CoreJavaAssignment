package com.inheritanceparentchild;

public class Doctor extends Person1 {
	int id,liscence;
	String specilization;
	public void setId(int id) {
		this.id = id;
	}
	public void setLiscence(int liscence) {
		this.liscence = liscence;
	}
	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}
	void display()
	{
		super.display();
		System.out.println(id+" "+specilization+" "+liscence);
	}
}
