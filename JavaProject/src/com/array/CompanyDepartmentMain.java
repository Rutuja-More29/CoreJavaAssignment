package com.array;

import java.util.Scanner;

public class CompanyDepartmentMain {

	public static void main(String[] args) {
		Company comp[]=new Company[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<comp.length;i++)
		{
			Department dep[]=new Department[3];
			System.out.println("Enter company cid,cname:");
			int cid=sc.nextInt();
			String cname=sc.next();
			System.out.println("Enter Department information:");
			for(int j=0;j<dep.length;j++)
			{
				System.out.println("Enter Department id,name,empno:");
				int id=sc.nextInt();
				String name=sc.next();
				int empNo=sc.nextInt();
				dep[j]=new Department(id,name,empNo);
			}
			comp[i]=new Company(cid,cname,dep);
		}
		for(Company c:comp)
		{
			System.out.println(c);
		}
	}

}
