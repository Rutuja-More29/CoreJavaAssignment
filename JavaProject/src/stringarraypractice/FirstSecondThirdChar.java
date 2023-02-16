package stringarraypractice;

public class FirstSecondThirdChar {

	public static void main(String[] args) {
		String s1="HELLO";
		String s2="HOW";
		String s3="HI";
		
		for(int i=0;i<s1.length();i++)
		{
			if(i<s1.length())
			{
				System.out.print(s1.charAt(i));
			}
			if(i<s2.length())
			{
				System.out.print(s2.charAt(i));
			}
			if(i<s3.length())
			{
				System.out.print(s3.charAt(i));
			}
			System.out.println();
		}

	}

}
