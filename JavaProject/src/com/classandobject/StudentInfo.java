package com.classandobject;

public class StudentInfo {
	int id,marks;
	String name,dept;
	float fee;
	StudentInfo(int id,String name,String dept,float fee,int marks)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.fee=fee;
		this.marks=marks;
	}
	public String toString()
	{
		return id+" "+name+" "+dept+" "+fee+" "+marks;
	}
	

	public static void main(String[] args) {
		StudentInfo s= new StudentInfo(101,"abcd","comp",5000f,80);
		StudentInfo s1=new StudentInfo(102,"pqrs","ec",4000f,70);
		System.out.println(s);
		System.out.println(s1);

	}

}
