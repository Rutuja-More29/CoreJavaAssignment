package writtenexceptionhandling;

public class Precedence {
	int m1()
	{
		try {
			System.out.println("try block");
			return 30;
		}
		finally {
			System.out.println("finally block");
			return 50;
		}
	}

	public static void main(String[] args) {
	Precedence p=new Precedence();
	
	System.out.println(p.m1());
	}

}
