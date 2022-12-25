package com.exception;



public class ArrayElementException {

	public static void main(String[] args) {
		int a=200,b=5;
		int arr[]= {10,20,30,40,50,60,70};
		String s="India";
		try {
			System.out.println("Division:"+(a/b));
			System.out.println("element index:"+arr[3]);
			System.out.println("character:"+s.charAt(5));
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		

	}

}
