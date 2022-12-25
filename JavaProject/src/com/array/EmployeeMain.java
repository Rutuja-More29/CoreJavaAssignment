package com.array;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e[]=new Employee[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter id,name,dept,salary of employee:");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			float salary=sc.nextInt();
			e[i]=new Employee(id,name,dept,salary);
			
		}
		for(Employee em: e )
		{
			if(em.salary>=60000)
			{
				System.out.println(em);
			}
		}
		for(Employee em:e)
		{
			
			if(em.dept.equals("hr")) {
				em.hike();
				System.out.println(em);
			}
			
		}
	}

}
