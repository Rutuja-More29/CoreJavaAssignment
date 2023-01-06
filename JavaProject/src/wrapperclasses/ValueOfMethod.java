package wrapperclasses;

public class ValueOfMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer it=Integer.valueOf(100); // integer value
		System.out.println(it);
		Integer it1=Integer.valueOf("1000"); //Numerical String
		System.out.println(it1);
		Integer it2=Integer.valueOf("101", 2);
		System.out.println(it2);
		
		Float f=Float.valueOf( 25.1f);
		System.out.println(f);
		Float f1=Float.valueOf("20.5");  //floating string value
		System.out.println(f1);
		
		Long l1=Long.valueOf(500);
		System.out.println(l1);
		Long l2=Long.valueOf("30"); // long String value
		System.out.println(l2);
		Long l3=Long.valueOf("1234", 5);
		System.out.println(l3);
		
		String s="7632";
		int x=Integer.parseInt(s); // Integer value convert primitive data type
		System.out.println(x);
		
		
		float p=Float.parseFloat("45.5");
		System.out.println(p);
		
	}

}
