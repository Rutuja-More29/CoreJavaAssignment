package com.containment;

public class StudentDepartmentMain {

	public static void main(String[] args) {
		Department d = new Department();
		d.setId(101);
		d.setName("comp");

		Student s = new Student();
		s.setRoll(211);
		s.setName("uv");
		s.setD(d);

		System.out.println(s);

	}

}
