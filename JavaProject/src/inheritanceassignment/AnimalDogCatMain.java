package inheritanceassignment;
//Hierarchical
class Animal{
	void eat()
	{
		System.out.println("eating.....");
	}
}
class Dog extends Animal{
	void bark()
	{
		System.out.println("barking....");
	}
}
class Cat extends Animal{
	void meow()
	{
		System.out.println("meow....");
	}
}
public class AnimalDogCatMain {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.eat();
		c.meow();

	}

}
