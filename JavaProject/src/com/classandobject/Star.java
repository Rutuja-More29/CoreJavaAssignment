package com.classandobject;

public class Star {
	void star(int num)
	{
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void number(int num) {
		for(int i=0;i<=num;i++) {
			for(int j=0;j<=i;j++) {
				if(i%2==0)
					System.out.print(0);
				else
					System.out.print(1);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Star s=new Star();
		s.star(5);
		s.number(4);
	}

}
