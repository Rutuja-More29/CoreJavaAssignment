package com.practice;

public class Polymorphism {
	void pattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void pattern(int num)
	{
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Polymorphism p=new Polymorphism();
		p.pattern();
		p.pattern(1);

	}

}
