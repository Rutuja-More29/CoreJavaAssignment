package com.arraypractice;

import java.util.Scanner;

public class EmployeeDateMain {

	public static void main(String[] args) {
	Employee e[]=new Employee[3];
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<e.length;i++)
	{
		System.out.println("Enter id,name,salary:");
		int id=sc.nextInt();
		String name=sc.next();
		int salary=sc.nextInt();
		
		
		Date d1[]=new Date[3];
		
		System.out.println("Enter joing dates:");
		for(int j=0;j<d1.length;j++)
		{
			System.out.println("Enter day ,month,year:");
			String day=sc.next();
			String month=sc.next();
			String year=sc.next();
			Date d=new Date();
			d.setDay(day);
			d.setMonth(month);
			d.setYear(year);
			d1[j]=d;
			
		}
		Employee e1=new Employee();
		e1.setId(id);
		e1.setName(name);
		e1.setSalary(salary);
		e1.setD(null);
		e[i]=e1;
		
		
	}

	}

}
