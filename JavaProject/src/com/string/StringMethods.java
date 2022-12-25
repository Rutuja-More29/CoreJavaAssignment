package com.string;

public class StringMethods {

	public static void main(String[] args) {
		String s1="Java";
		String s2="Language";
		String s3="java";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s3));
		System.out.println(s2.contains("a"));
		System.out.println(s1.equals(s3));
		System.out.println(s3.toUpperCase());
		System.out.println(s2.startsWith("J"));
		System.out.println(s1.equalsIgnoreCase(s3));
		

	}

}
