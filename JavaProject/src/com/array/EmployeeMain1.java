package com.array;

import java.util.Scanner;

public class EmployeeMain1 {

	public static void main(String[] args) {
		Employee1 e1[]=new Employee1[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter id,name,dept,salary");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			float salary=sc.nextFloat();
			Employee1 e=new Employee1();
			e.setId(id);
			e.setName(name);
			e.setDept(dept);
			e.setSalary(salary);
			e1[i]=e;
		}
		for(Employee1 e:e1)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());
		}
		for(Employee1 e:e1)
		{
			if(e.dept.equals("hr") && e.salary>=60000)
			{
				e.hike();
				System.out.println(e);
			}
		}
	}

}
