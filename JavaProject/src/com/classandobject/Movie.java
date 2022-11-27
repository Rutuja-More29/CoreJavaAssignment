package com.classandobject;
import java.util.Scanner;
public class Movie {
	int id,releaseyear;
	String name,producer,budget;
	Movie(int id,String name,int releaseyear,String producer,String budget)
	{
		this.id=id;
		this.name=name;
		this.releaseyear=releaseyear;
		this.producer=producer;
		this.budget=budget;
	}
	public String toString()
	{
		return id+" "+name+" "+releaseyear+" "+producer+" "+budget;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			System.out.println("Enter movie id:");
			int id=sc.nextInt();
			System.out.println("Enter movie name:");
			String name=sc.next();
			System.out.println("Enter movie releasryear:");
			int releaseyear=sc.nextInt();
			System.out.println("Enter producer:");
			String producer=sc.next();
			System.out.println("Enter budget:");
			String budget=sc.next();
			Movie m=new Movie(id,name,releaseyear,producer,budget);
			System.out.println(m);
			
		}

	}

}
