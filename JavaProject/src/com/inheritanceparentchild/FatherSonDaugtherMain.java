package com.inheritanceparentchild;

public class FatherSonDaugtherMain {

	public static void main(String[] args) {
		Son s=new Son();
		s.setName("aaa");
		s.setAge(22);
		System.out.println(s.getName()+" "+s.getAge());
		s.education();
		s.address();
	
		
		Daugther d=new Daugther();
		d.setName("bbb");
		d.setAge(23);
		System.out.println(d.getName()+" "+d.getAge());
		
		d.education();
		d.address();

	}

}
