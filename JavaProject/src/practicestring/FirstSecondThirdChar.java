package practicestring;
import java.util.Scanner;
public class FirstSecondThirdChar {
	void displaychar(String s1,String s2,String s3)
	{
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three string:");
		String s1=sc.next();
		String s2=sc.next();
		String s3=sc.next();
		FirstSecondThirdChar fst=new FirstSecondThirdChar();
		fst.displaychar(s1, s2, s3);
	}

}
