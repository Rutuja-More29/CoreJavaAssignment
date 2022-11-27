package com.practice;
// inheritance
public class Person {
	private String name,gender;
	private int age,id;
	Address a;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getGender()
	{
		return gender;
	}
	public void setA(Address a)
	{
		this.a=a;
	}
	public Address getA()
	{
		return a;
	}
	public String toString()
	{
		return id+" "+name+" "+age+" "+gender+" "+a;
	}
}
