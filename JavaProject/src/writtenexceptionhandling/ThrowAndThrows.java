package writtenexceptionhandling;
// Wap to show throw and throws keyword
public class ThrowAndThrows {
	static void method()throws ArithmeticException{
		System.out.println("Inside the method");
		throw new ArithmeticException("throwing ArithmeticException");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			method();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
	}

}
