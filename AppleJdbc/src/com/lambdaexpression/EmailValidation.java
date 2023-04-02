package com.lambdaexpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>email=new ArrayList<>();
		email.add("abc@gmail.com");
		email.add("abc123@gmail.com");
		email.add("abc.123@gmail.co.in");
		email.add("abc#gmail.com");
		email.add("abc#gmail#com");
		email.add("abc.def123@gmail.com");
		
	/*	String regex="^[A-Za-z0-9+._-]+@(.+)$";
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher("abc@gmail.com");
		if(m.matches())
			System.out.println("valid email");
		else
			System.out.println("not valid email");*/
		
		String reg="(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#$!&]).{8,15}$";
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher("Abc@def12");
		if(m.matches())
			System.out.println("valid password");
		else
			System.out.println("not valid");
	}

}
