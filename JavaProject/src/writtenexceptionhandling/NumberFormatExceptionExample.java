package writtenexceptionhandling;



public class NumberFormatExceptionExample {
	

	public static void main(String[] args) {
	// numberformatException generated
	/*	int i1=Integer.parseInt(null);
		System.out.println(i1);*/
		
		// NumberformatException handle
		String s="50k";
		try {
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number format Exception handle");
		}
		
	}

}
