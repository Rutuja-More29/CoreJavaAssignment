package com.polymorphism;

public class Addition {
	void add(int a,int b)
	{
		System.out.println("Addition of 2 numbers:"+(a+b));
	}
	void add(int a,String b)   // diff parameter
	{
		System.out.println("Addition of int and String  parameter:"+(a+b));
	}
	void add(String a,String b)
	{
		System.out.println("Addition of 2 String:"+(a+b));
	}
	

	public static void main(String[] args) {
		Addition a= new Addition();
		a.add(4, 5);
		a.add(2, "abc");
		a.add("abc", "xyz");

	}

}
