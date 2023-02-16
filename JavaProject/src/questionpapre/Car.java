package questionpapre;

public class Car {

	int modelno;
	String name;
	int price;
	public static String company;
	Car(){}
	Car(int modelno,String name,String c)
	{
		this.modelno=modelno;
		this.name=name;
		this.company=c;
		this.price=price;
	}
	public String toString()
	{
		return modelno+" "+name+" "+price+" "+company;
	}

}
