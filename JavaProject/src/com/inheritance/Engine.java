package com.inheritance;
// using constructor
public class Engine {
	int cylinder,torque;
	String color,company;
	Engine(String company,int cylinder,int torque,String color)
	{
		this.company=company;
		this.cylinder=cylinder;
		this.torque=torque;
		this.color=color;
	}
	public String toString() {
		return company+" "+cylinder+" "+torque+" "+color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
