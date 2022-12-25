package writtenabstraction;

public interface Juice {
void drink();
}

class Mastani implements IceCream,Juice{
public static void main(String args[]) {
	Mastani m=new Mastani();
	m.eat();
	m.drink();
}
	
	@Override
	public void drink() {
		System.out.println("drinking juice");
		
	}

	@Override
	public void eat() {
		System.out.println("Eating IceCream");
		
	}
	
}