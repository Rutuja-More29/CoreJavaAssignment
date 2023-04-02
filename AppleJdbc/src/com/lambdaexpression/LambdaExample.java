package com.lambdaexpression;
interface A{
	void display();
}
public class LambdaExample {

	public static void main(String[] args) {
		
		//argument list->{implementation}
		A obj=()->{System.out.println("in display method");};
		obj.display();

	}

}
