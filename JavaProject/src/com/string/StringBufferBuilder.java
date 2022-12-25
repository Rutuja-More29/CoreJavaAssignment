package com.string;

import java.util.Scanner;

public class StringBufferBuilder {

	public static void main(String[] args) {
		StringBuffer sbf=new StringBuffer("Java language"); // default capacity=16
		/*System.out.println("capacity:"+sbf.capacity());
		System.out.println("length:"+sbf.length());
		// System.out.println("reverse:"+sbf.reverse());
		// System.out.println(sbf.deleteCharAt(2));
		// System.out.println(sbf.delete(5, 8));
		System.out.println(sbf.append("core"));*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s1=sc.nextLine();
		sbf.append(s1);
	}

}
