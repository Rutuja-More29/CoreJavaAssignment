package com.containment;

public class EmployeeDateMydateMain2 {

	public static void main(String[] args) {
		Dept2 d2 =new  Dept2(101,"ece");
		Mydate2 m2=new Mydate2("thursday","nov",2022);
		Employee2 e2=new Employee2(111,"abcde",50000,d2,m2);
		System.out.println(e2);

	}

}
