package inheritanceassignment;
// single level
class Fruit{
	void noOfFruit()
	{
		System.out.println("12 Fruits");
	}
	void taste()
	{
		System.out.println("fruits are sweet");
	}
	
}
class Apple extends Fruit{
	void color()
	{
		System.out.println("Apple is red");
	}
	
}
public class FruitAppleMain {

	public static void main(String[] args) {
		Apple a1=new Apple();
		a1.noOfFruit();
		a1.taste();
		a1.color();

	}

}
