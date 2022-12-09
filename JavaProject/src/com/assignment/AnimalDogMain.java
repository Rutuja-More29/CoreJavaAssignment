package com.assignment;
//single level inheritance
class Animal{
	void eat()
	{
		System.out.println("eating food");
	}
}
class Dog extends Animal{
	void run()
	{
		System.out.println(" running on ground");
	}
}
public class AnimalDogMain {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.run();
	

	}

}
