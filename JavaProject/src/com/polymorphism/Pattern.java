package com.polymorphism;

public class Pattern {
	// method without parameter
	void display()                  // method overloading
	{
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// method with single parameter
	void display(char symbol)
	{ 
		
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--) {
				System.out.print(symbol);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern p=new Pattern();
		p.display();      // call method without argument
		System.out.println("\n");
		p.display('a');   // call method with single argument

	}

}
