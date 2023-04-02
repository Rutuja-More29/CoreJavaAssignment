package monthlytest;

class Car{
	String name;
	static String color="White";
}
public class Demo {
	static void changeColor(Car c1) {
		c1.color="yellow";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car();
		c1.color="blue";
		Car c2=new Car();
		c2.color="Pink";
		System.out.println(c1.color);
		System.out.println(c2.color);

	}

}
