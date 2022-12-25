package com.dao;

import java.time.LocalDate;
import java.util.Scanner;
import com.pojo.Book;
import com.pojo.Student;
import com.pojo.Transaction;

public class LabOperation {
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter id,name,author,copyno:");
	//System.out.println("Enter Student sid,sname,sdept,semail,scontact:");
	int sid=sc.nextInt();
	String name=sc.next();
	String author=sc.next();
	int copyno=sc.nextInt();
	
	LabOperation()
	{
		
	}
	LabOperation(Book b)
	{
	b.setId(sid);
	b.setName(name);
	b.setAuthor(name);
	b.setCopyno(copyno);
	
	}
	public void issueBook()
	{
		LabOperation lab;
		Student s1;
		Transaction t;
		LocalDate obj = LocalDate.now();
		System.out.println(obj);
		
		
		
	}
}
