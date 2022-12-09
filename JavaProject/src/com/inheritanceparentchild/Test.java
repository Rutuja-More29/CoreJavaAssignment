package com.inheritanceparentchild;
//hierarchical inheritance
 class A{
	public void A()
	{
		System.out.println("class A");
	}
 }
	class B extends A{
		public void B()
		{
			System.out.println("class B");
		}
	}
		class C extends A{
			public void C()
			{
				System.out.println("class C");
			}
		}
	

public class Test {
	

	public static void main(String[] args) {
		B b1=new B();
		b1.A();
		b1.B();
		C c1=new C();
		c1.A();
		c1.C();
		

	}

}
