package com.inheritanceparentchild;

public class PersonStudentFacultyMain {

	public static void main(String[] args) {
		Student s=new Student();
		s.setId(101);
		
		Faculty f=new Faculty();
		f.setId(111);
		f.setName("aaa");
		f.setCollege("SCSMCOE");
		f.setAge(22);
		f.setPercentage(70);
		f.setContact(986756342);
		f.setSalary(56000);
		f.setSubject("math");
		f.grade();
		f.pfCalculate(56000);
		
		System.out.println(f.getId()+" "+f.getName()+" "+f.getCollege()+" "+f.getAge()+" "+f.getPercentage()+" "+f.getSubject()+" "+f.getSalary());

	}

}
