package com.dao;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import com.pojo.Book;
import com.pojo.Student;
import com.pojo.Transaction;

public class Library {
	Book b[] = new Book[10];
	Student s[] = new Student[5];
	Transaction t[] = new Transaction[5];
	Scanner sc = new Scanner(System.in);

/*	public void bookData() {
		System.out.println("Enter no.of book");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter id,name,author,copyno:");
			int id = sc.nextInt();
			String name = sc.next();
			String author = sc.next();
			int copyno = sc.nextInt();

			Book b1 = new Book();
			b1.setId(id);
			b1.setName(name);
			b1.setAuthor(author);
			b1.setCopyno(copyno);

			b[i] = b1;
		}
	}

	public void addBookData() {

		System.out.println("Enter id,name,author,copyno:");
		int id = sc.nextInt();
		String name = sc.next();
		String author = sc.next();
		int copyno = sc.nextInt();

		Book b1 = new Book();
		b1.setId(id);
		b1.setName(name);
		b1.setAuthor(author);
		b1.setCopyno(copyno);

		for (int i = 0; i < b.length; i++) {
			if (b[i] == null) {
				b[i] = b1;
				break;
			}
		}
	}
	public void displayBook()
	{
		System.out.println(Arrays.toString(b));
	}
	public void studentData()
	{
		System.out.println("Enter no.of student:");
		int sdsize=sc.nextInt();
		for(int i=0;i<sdsize;i++) {
		System.out.println("Enter Student sid,sname,sdept,semail,scontact:");
		int sid=sc.nextInt();
		String name=sc.next();
		String sdept=sc.next();
		String semail=sc.next();
		long scontact=sc.nextLong();
		
		Student s1=new Student();
		s1.setSid(sid);
		s1.setSname(name);
		s1.setSdept(sdept);
		s1.setSemail(semail);
		s1.setScontact(scontact);
		s[i]=s1;
		}
	}
	public void issueBook()
	{
		System.out.println("Enter bookName:");
		String bookName=sc.next();
		SimpleDateFormat sdfo=new SimpleDateFormat();
		
		
		
		
		
	}*/
	
}
