package com.array;

import java.util.Scanner;

public class MovieThreaterMain {

	public static void main(String[] args) {
		Threater t[]=new Threater[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<t.length;i++)
		{
			Movie m[]=new Movie[3];
			System.out.println("Enter threater id,name:");
			int tid=sc.nextInt();
			String tname=sc.next();
			System.out.println("Enter Movie information:");
			for(int j=0;j<m.length;j++)
			{
				System.out.println("Enter Movie id,name,releaseyear:");
				int id=sc.nextInt();
				String name=sc.next();
				int releaseyear=sc.nextInt();
				m[j]=new Movie(id,name,releaseyear);
			}
			t[i]=new Threater(tid,tname,m);
		}
		for(Threater te:t)
		{
		
			System.out.println(te);
		}
		
	}

}
