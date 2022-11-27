package com.classandobject;

import java.util.Scanner;

public class Shopping1 {
	int quantity;
	String name;
	int price;
	
	Scanner sc=new Scanner(System.in);
	private String bill;
	void acceptDetails()
	{
		System.out.println("Enter Item name:");
		name=sc.next();
		System.out.println("Enter Quantity:");
		quantity=sc.nextInt();
		System.out.println("Enter Price of Item:");
		price=sc.nextInt();
	}
	void calculate()
	{
		 System.out.println("Total Bill:"+(quantity*price));
	}
	void display()
	{
		if(quantity>0)
		{
		System.out.println("Item name:"+name);
		System.out.println("Total Quantity:"+quantity);
		System.out.println("Prize of Item:"+price);
		}
		else
		System.out.println("error");
	}

	public static void main(String[] args) {
		Shopping1 s1=new Shopping1();
		s1.acceptDetails();
		s1.calculate();
		s1.display();

	}

}
