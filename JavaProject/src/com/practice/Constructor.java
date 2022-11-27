package com.practice;
// constructor overloading
public class Constructor {
int id,marks,roll;
String name,dept,email;
long contact;

	Constructor(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	Constructor(int roll,String dept,String email,long contact)
	{
		this.roll=roll;
		this.dept=dept;
		this.email=email;
		this.contact=contact;
	}
	public String toString()
	{
		return id+" "+name+" "+marks+roll+dept+email+contact;
	}
	public static void main(String[] args) {
		Constructor c=new Constructor(101,"rutu",90);
		Constructor c1=new Constructor(111,"comp","rm20@gmail.com",956198406);
		System.out.println(c);
		System.out.println(c1);

	}

}
