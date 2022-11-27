package com.encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(101);
		s.setName("abcd");
		s.setDept("comp");
		s.setMarks(70);
		
		
		Student s1=new Student();
		s1.setId(102);
		s1.setName("pqrs");
		s1.setDept("ec");
		s1.setMarks(80);
		
		Student s2=new Student();
		s2.setId(103);
		s2.setName("uvw");
		s2.setDept("mech");
		s2.setMarks(90);
		
		
		Student s3=new Student();
		s3.setId(104);
		s3.setName("aaaa");
		s3.setDept("civil");
		s3.setMarks(60);
		
		Student s4=new Student();
		s4.setId(105);
		s4.setName("bbbb");
		s4.setDept("aiml");
		s4.setMarks(90);
		
		System.out.println(s.getId()+" "+s.getName()+" "+s.getDept()+" "+s.getMarks());
		System.out.println(s1.getId()+" "+s1.getName()+" "+s1.getDept()+s1.getMarks());
		System.out.println(s2.getId()+" "+s2.getName()+" "+s2.getDept()+" "+s2.getMarks());
		System.out.println(s3.getId()+" "+s3.getName()+" "+s3.getDept()+" "+s3.getMarks());
		System.out.println(s4.getId()+" "+s4.getName()+" "+s4.getDept()+" "+s4.getMarks());
	}

}
