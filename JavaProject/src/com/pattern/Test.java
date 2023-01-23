package com.pattern;

public class Test {
	public static boolean check(int num)
	{
		
		while(num>0)
		{
			if(num%10==3)
			{
				return true;
			}
			num=num/10;
		}
		return false;
	}

	public static void main(String[] args) {
		int num=72014332;
		Test t=new Test();
		t.check(num);
		System.out.println();

	}

}
