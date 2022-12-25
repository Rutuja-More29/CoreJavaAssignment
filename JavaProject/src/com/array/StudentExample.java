package com.array;

import java.util.Scanner;

public class StudentExample {

	public static void main(String[] args) {
		Student stud[]=new Student[4];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<4;i++)
		{
			System.out.println("Enter id,name,dept,marks of student:");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int marks=sc.nextInt();
			stud[i]=new Student(id,name,dept,marks);
		}
		for(Student s:stud)
		{
			if(s.marks>=65 && s.dept.equals("comp"))
			System.out.println(s);
		}
	}

}
