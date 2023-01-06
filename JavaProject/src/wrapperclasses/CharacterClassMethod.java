package wrapperclasses;

public class CharacterClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch='8';
		int i=Character.getNumericValue(ch);
		System.out.println(i);
		System.out.println("Digit:"+Character.isDigit(ch));
		System.out.println("Character:"+Character.isLetter(ch));
		System.out.println("Lower:"+Character.isLowerCase(ch));
		System.out.println("Upper:"+Character.isUpperCase(ch));
		System.out.println("whiteSpace:"+Character.isWhitespace(ch));
		System.out.println("max value:"+Character.MAX_VALUE); // not printable only assign
		System.out.println("min value:"+Character.MIN_VALUE); // not printable only assign
		
		
		System.out.println("integer max:"+Integer.MAX_VALUE);
		System.out.println("integer min:"+Integer.MIN_VALUE);
		System.out.println("max:"+Integer.max(10,20));
		System.out.println( "compare:"+Integer.compare(100, 50));
		System.out.println( "binary:"+ Integer.toBinaryString(5));
		System.out.println(Integer.toHexString(5));
		System.out.println(Integer.toOctalString(5));

	}

}
