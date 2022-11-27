package com.containment;

public class PersonAddressMain {

	public static void main(String[] args) {
		Address a= new Address();
		a.setCity("Ahmednagar");
		a.setState("Maharashtra");
		a.setCountry("India");
		
		Person p= new Person();
		p.setName("Shubh");
		p.setAge(23);
		p.setGender("Male");
		p.setA(a);
		
		System.out.println(p);

	}

}
