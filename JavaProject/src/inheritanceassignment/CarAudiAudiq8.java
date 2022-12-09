package inheritanceassignment;
class Car{
	void wheelno()
	{
		System.out.println("4 wheeler");
	}
	void headLigth()
	{
		System.out.println("2 headLight");
	}
	void Speed()
	{
		System.out.println("50Kmph");
	}
}
class Audi extends Car{
	void speedAudi()
	{
		System.out.println("70Kmph");
	}
	void features()
	{
		System.out.println("music system");
	}
}
class Audiq8 extends Audi{
	void speed()
	{
		System.out.println("90Kmph");
	}
	void features()
	{
		System.out.println("music system,ac,tv");
	}
}

public class CarAudiAudiq8 {

	public static void main(String[] args) {
		Audiq8 a1=new Audiq8();
		a1.wheelno();
		a1.headLigth();
		a1.Speed();
		a1.speedAudi();
		a1.features();
		a1.speed();

	}

}
