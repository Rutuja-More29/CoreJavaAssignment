package com.lambdaexpression;
 interface A2{
	  int max(int a,int b,int c);
 }
public class MaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 obj=(int a,int b,int c)->{
			if(a>b&&a>c)
				return a;
			else if(b>a && b>c)
				return b;
			else
				return c;
		};
		System.out.println(obj.max(10, 20, 5));
		
	}

}
