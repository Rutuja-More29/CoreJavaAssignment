package augusttest;

public class StringExample {

	public static void main(String[] args) {
		String str1="think";
		String str2=new String("quotient");
		String str3=str2.intern();
		System.out.println(str2==str3);
		String str4=str1+"java";
		String str5="thinkquotient";
		System.out.println(str4==str5);
		System.out.println(str4.equals(str5));
		System.out.println();
		
	}

}
