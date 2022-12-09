package com.inheritance;

public class PersonAddressMain {

	public static void main(String[] args) {
		Address a= new Address("wadgaonsheri","pune",414010,"maharashtra");
		Person p= new Person(101,"Rutuja","rm29@gmail.com",975643293,a);
		System.out.println(p);
		
		Address a1=new Address("waninagar","ahmednagar",414101,"maharashtra");
		Person p1=new Person(102,"aaa","ab25@gmail.com",987654321,a1);
		System.out.println(p1);
		
		Address a2=new Address("khandobanagar","nagar",414106,"maharashtra");
		Person p2=new Person(103,"bbb","ab20@gmail.com",987654322,a2);
		System.out.println(p2);

	}

}
