package com.classandobject;
import java.util.Scanner;
public class Shopping {
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
		
		System.out.println("Item name:"+name);
		System.out.println("Total Quantity:"+quantity);
		System.out.println("Prize of Item:"+price);
		
	}

	public static void main(String[] args) {
		Shopping s=new Shopping();
		s.acceptDetails();
		s.calculate();
		s.display();

	}

}
