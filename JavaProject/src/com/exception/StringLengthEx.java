package com.exception;
// runtime
public class StringLengthEx {
	int getStringLength(String s) throws NullPointerException
	{
		return s.length();
	}

	public static void main(String[] args) {
		StringLengthEx s1=new StringLengthEx();
		System.out.println(s1.getStringLength("India"));
		System.out.println(s1.getStringLength("mumbai"));
		try {
			System.out.println(s1.getStringLength(null));
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		System.out.println(s1.getStringLength("language"));
		System.out.println(s1.getStringLength("java"));
		

	}

}
