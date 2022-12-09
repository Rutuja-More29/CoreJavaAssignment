package com.containment;

public class Person1IdProofMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdProof ip=new IdProof();
		ip.setName("abcd");
		ip.setNumber(4506783);
		ip.setAddress("pune");
		
		Person1 p1=new Person1();
		p1.setPname("aaa");
		p1.setAge(23);
		p1.setContact(987654321);
		p1.setIdp(ip);
		
		System.out.println(p1);
		
		
	}

}
