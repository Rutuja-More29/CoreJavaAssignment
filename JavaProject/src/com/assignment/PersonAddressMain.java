package com.assignment;

public class PersonAddressMain {

	public static void main(String[] args) {
		Address a1=new Address();
		a1.setId(101);
		a1.setName("aaa");
		a1.setAge(20);
		a1.setContact(98675432);
		a1.setCity("pune");
		a1.setPincode(411014);
		a1.setState("Maharashtra");
		System.out.println(a1.getId()+" "+a1.getName()+" "+a1.getAge()+" "+a1.getContact()+" "+a1.getCity()+" "+a1.getPincode()+" "+a1.getState());

	}

}
