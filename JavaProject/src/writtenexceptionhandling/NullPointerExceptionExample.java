package writtenexceptionhandling;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		String s=null;
		try
		{
			if(s.equals("radar"))
				System.out.println("same");
			else
				System.out.println("not same");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException caugth");
		}

	}

}
