package com.containment;

public class StudentDepartmentMain2 {

	public static void main(String[] args) {
		Department2 d2=new Department2(111,"mech");
		Student2 s2=new Student2(222,"aaa",d2);
		System.out.println(s2);

	}

}
