package com.array;

import java.util.Scanner;

public class StudentUsingGetterSetterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentUsingGetterSetter stud[]=new StudentUsingGetterSetter[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter id,name,dept,marks:");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int marks=sc.nextInt();
			StudentUsingGetterSetter s=new StudentUsingGetterSetter();
			s.setId(id);	
			s.setName(name);
			s.setDept(dept);
			s.setMarks(marks);
			stud[i]=s;
		}
		for(StudentUsingGetterSetter s:stud)
		{
			System.out.println(s.getId()+" "+s.getName()+" "+s.getDept()+" "+s.getMarks());
		}
	}

	

}
