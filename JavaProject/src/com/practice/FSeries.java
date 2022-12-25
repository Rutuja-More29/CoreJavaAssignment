package com.practice;

public class FSeries {
	int f1=0,f2=1;
	int f3;
	void fibonacci(int num)
	{
		System.out.print(f1+" "+f2);
		for(int i=2;i<=num;i++)
		{
			f3=f1+f2;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
		}
	}

	public static void main(String[] args) {
		int num=10;
		FSeries f=new FSeries();
		f.fibonacci(num);
		

	}

}
