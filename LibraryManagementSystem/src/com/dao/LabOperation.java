package com.dao;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import com.pojo.Book;
import com.pojo.Student;
import com.pojo.Transaction;

public class LabOperation {
	Book b[]=new Book[5];
	Student s[]=new Student[2];
	Transaction t[]=new Transaction[5];
	Scanner sc=new Scanner(System.in);
	public LabOperation()
	{
	b[0]=new Book(101,2,"science","abcd");
	b[1]=new Book(102,3,"History","abab");
	b[2]=new Book(103,2,"Geography","pqrs");
	b[3]=new Book(104,4,"Investment","egfd");
	b[4]=new Book(105,5,"Motivational","aabb");
	
	}
	public void viewBook()
	{
		for(Book b1:b)
		{
			System.out.println(b1);
		}
		for(Transaction tr:t)
		{
			System.out.println(tr);
		}
	}
	public void issueBook()
	{
		Student s1=new Student();
		Book books=new Book();
		System.out.println("Enter student sid,sname ,semail,sdept,scontact:");
		int sid=sc.nextInt();
		String sname=sc.next();
		String sdept=sc.next();
		String semail=sc.next();
		long scontact=sc.nextLong();
		s1.setSid(sid);
		s1.setSname(sname);
		s1.setSdept(sdept);
		s1.setSemail(semail);
		s1.setScontact(scontact);
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==null)
			{
				s[i]=s1;
				break;
			}
		}
		Transaction tr=new Transaction();
		System.out.println("Enter Bookname:");
		String bookName=sc.next();
		SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
		Calendar c=Calendar.getInstance();
		String issueDate=sdf.format(c.getTime());
		c.add(Calendar.DATE,15);
		String returnDate=sdf.format(c.getTime());
		tr.setBookName(bookName);
		tr.setIssueDate(issueDate);
		tr.setReturnDate(returnDate);
		tr.setS(s1);
		for(Book b2:b)
		{
			if(b2!=null)
			{
				if(b2.getName().equalsIgnoreCase(bookName) && b2.getCopyno()==0)
					System.out.println("not available on this time");
				break;
			}
		}
		for(int i=0;i<t.length;i++)
		{
			if(t[i]==null)
			{
				t[i]=tr;
				tr.setIssueDate(issueDate);
				break;
			}
		}
		for(Book b1: b)
		{
			if(b1!=null)
			{
				if(b1.getName().equalsIgnoreCase(bookName)) {
					if(b1.getCopyno()>0)
					{
						int count=b1.getCopyno();
						b1.setCopyno(count-1);
					}
				}
			}
		}
		
		
	}
	public void returnBook()
	{
		System.out.println("Enter bookname:");
		String bookName=sc.next();
		SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
		Calendar c=Calendar.getInstance();
		String returnDate=sdf.format(c.getTime());
		for(Transaction r:t)
		{
			if(r!=null)
			{
				if(r.getBookName().equalsIgnoreCase(bookName))
				{
					r.setReturnDate(returnDate);
					System.out.println(r.getBookName()+" "+r.getIssueDate()+" "+r.getReturnDate()+" "+r.getS());
				}
			}
		}
		for(Book b2:b)
		{
			if(b2!=null)
			{
				if(b2.getName().equalsIgnoreCase(bookName))
				{
					int count=b2.getCopyno();
					b2.setCopyno(count+1);
				}
			}
		}
	}
	
	

	 }
	
		
	

