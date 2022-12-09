package com.assignment;

public class StudentDepartment {

	public static void main(String[] args) {
		Department d1=new Department();
		d1.setName("bbbb");
		d1.setRollno(111);
		d1.setMarks(80);
		d1.setDept_id(201);
		d1.setDept_name("comp");
		System.out.println(d1.getRollno()+" "+d1.getName()+" "+d1.getMarks()+" "+d1.getDept_id()+" "+d1.getDept_name());
	}

}
