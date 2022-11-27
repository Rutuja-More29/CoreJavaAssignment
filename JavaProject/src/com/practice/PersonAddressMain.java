package com.practice;
//inheritance
public class PersonAddressMain {

	public static void main(String[] args) {
		Address a=new Address();
		a.setArea("khandobanagar");
		a.setCity("karanji");
		a.setPincode(414106);
		
		Person p=new Person();
		p.setId(1);
		p.setName("rutuja");
		p.setAge(22);
		p.setGender("female");
		p.setA(a);
		
		System.out.println(p);

	}

}
