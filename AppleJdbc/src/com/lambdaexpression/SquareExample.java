package com.lambdaexpression;
interface A1{
	void square(int a);
		
	
}
public class SquareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1 obj=(a)->{ System.out.println(a*a);};
		obj.square(10);

	}

}
