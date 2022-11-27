package com.assignment;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEmp_id(111);
		e.setName("abcd");
		e.setSalary(45000);
		System.out.println(e.getEmp_id()+" "+e.getName()+" "+e.getSal());

	}

}
