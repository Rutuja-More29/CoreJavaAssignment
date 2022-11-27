package com.classandobject;
import java.util.Scanner;
public class Student1 {
	int id,marks;
	String name,dept;
	void setData(int i,String n,int m,String d)
	{
		id=i;
		name=n;
		marks=m;
		dept=d;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+marks+" "+dept);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		int sid = sc.nextInt();
		System.out.println("Enter the name:");
		 String sname = sc.next();
		System.out.println("Enter the marks:");
		int smarks = sc.nextInt();
		System.out.println("Enter the dept:");
		String sdept = sc.next();
		Student1 s1=new Student1();
		s1.setData(sid,sname,smarks,sdept);
		
		
		System.out.println("Enter the id:");
		 sid = sc.nextInt();
		System.out.println("Enter the name:");
		  sname = sc.next();
		System.out.println("Enter the marks:");
		 smarks = sc.nextInt();
		System.out.println("Enter the dept:");
		 sdept = sc.next();
		Student1 s2=new Student1();
		s2.setData(sid, sname, smarks, sdept);
		
		System.out.println("Enter the id:");
		 sid = sc.nextInt();
		System.out.println("Enter the name:");
		  sname = sc.next();
		System.out.println("Enter the marks:");
		 smarks = sc.nextInt();
		System.out.println("Enter the dept:");
		 sdept = sc.next();
		Student1 s3=new Student1();
		s3.setData(sid, sname, smarks, sdept);
		
		System.out.println("Enter the id:");
		 sid = sc.nextInt();
		System.out.println("Enter the name:");
		  sname = sc.next();
		System.out.println("Enter the marks:");
		 smarks = sc.nextInt();
		System.out.println("Enter the dept:");
		 sdept = sc.next();
		Student1 s4=new Student1();
		s4.setData(sid, sname, smarks, sdept);
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		
	}

}
