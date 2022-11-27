package com.polymorphism;
//inheritance
public class Engine {
	int cylinder,torque;
	String rpm,company;
	
	public void setCompany(String company)
	{
		this.company=company;
	}
	public String getCompany()
	{
		return company;
	}
	public void setCylinder(int cylinder)
	{
		this.cylinder=cylinder;
	}
	public int getCylinder()
	{
		return cylinder;
	}
	public void setTorque(int torque)
	{
		this.torque=torque;
	}
	public int getTorque()
	{
		return torque;
	}
	public void setRpm(String rpm)
	{
		this.rpm=rpm;
	}
	public String getRpm()
	{
		return rpm;
	}
	public String toString()
	{
		return company+" "+rpm+" "+torque+" "+cylinder;
	}
	public static void main(String[] args) {
		

	}

}
