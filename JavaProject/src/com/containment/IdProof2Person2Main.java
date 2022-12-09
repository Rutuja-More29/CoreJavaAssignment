package com.containment;

public class IdProof2Person2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IdProof2 p2=new IdProof2("abcd",987654,"pune");
		Person2 p3=new Person2("aaa",23,98765432,p2);
		System.out.println(p3);
	}

}
