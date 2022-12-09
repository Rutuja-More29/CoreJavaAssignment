package com.inheritanceparentchild;

public class Fruit {

	void taste()
	{
		System.out.println("Fruit are generally sweet in taste");
	}
	
}
class Apple extends Fruit{
	void taste()
	{
		System.out.println("Apple are sweet to taste");
	}
}
class Strwaberry extends Fruit{
	void taste()
	{
		System.out.println("Strawberries are sweet and sour to taste");
	}
}
