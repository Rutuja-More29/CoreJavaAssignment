package com.abstraction;
interface A
{
	void add(int a,int b);
	void sqrt(int a);

	
}
interface B
{
	void square(int a);
}
class ABC implements A,B
{
	public void add(int a,int b)
	{
		System.out.println("Addition interface:"+(a+b));
	}
	public void sqrt(int a)
	{
		System.out.println("sqrt:"+Math.sqrt(a));
	}
	public void square(int a)
	{
		System.out.println("square:"+(a*a));
	}
}
public class MultipleMain {

	public static void main(String[] args) {
		ABC obj=new ABC();
		obj.add(100, 200);
		obj.sqrt(20);
		obj.square(10);

	}

}
