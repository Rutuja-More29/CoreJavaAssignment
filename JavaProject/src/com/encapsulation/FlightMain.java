package com.encapsulation;

public class FlightMain {

	public static void main(String[] args) {
		Flight f=new Flight();
		f.setId(201);
		f.setCompany("abcd");
		f.setDestination("aaa");
		f.setTicketrate(300);
		System.out.println(f.getId()+" "+f.getCompany()+" "+f.getDestination()+" "+f.getTicketrate());

	}

}
