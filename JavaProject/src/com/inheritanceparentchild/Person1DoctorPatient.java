package com.inheritanceparentchild;

public class Person1DoctorPatient {

	public static void main(String[] args) {
		Patient p=new Patient();
		p.setPid(198);
		p.setDisease("xyz");
		p.setBedno(201);
		p.setAge(30);
		p.setContact(986745231);
		p.setName("pqrs");
		p.setGender("male");
		p.setId(1111);
		p.setSpecilization("surgen");
	
		
		p.display();
		System.out.println("-------Doctor----");
		Doctor d=new Doctor();
		d.setId(109);
		d.setLiscence(123456);
		d.setSpecilization("surgen");
		d.setAge(30);
		d.setContact(986745231);
		d.setName("pqrs");
		d.setGender("male");
	
		d.display();
	}

}
