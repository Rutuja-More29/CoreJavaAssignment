package com.abstraction;
//final can be use variable ,method,class

class Aa {                // final class can not be inherited
	final int a = 100;      // final variable can not be reinitialized

	void display()           // final method can not be overridden
	{
		System.out.println("In display method ...." + a);
	}
}

class Bb extends Aa {
	void display1() {
		System.out.println("In B class display method... " + a);
	}
}

public class FinalMain {

	public static void main(String[] args) {
		Bb obj = new Bb();
		obj.display();
		obj.display1();

	}

}
