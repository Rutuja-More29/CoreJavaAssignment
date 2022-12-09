package com.inheritanceparentchild;


	class A1
	{
		A1()
		{
			System.out.println("class A1 constructor");
		}
	}
	 class B1 extends A1
	 {
		B1()
		{
			System.out.println("Default constuctor class B1");
		}
		B1(int a)
		{
			System.out.println("Parameterized constructor class B1");
		}
		
	}
	class C1 extends B1
	{
		C1()
		
		{
			super(10);
			System.out.println("Constructor class c1");
			
		}
	}
	public class ConstructorMain {
	public static void main(String[] args) {
		C1 c1=new C1();

	}

}
