package practicestring;
import java.util.Scanner;
public class Palindrome {
	void checkPalindrome(String s)
	{
		String rev="";
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		Palindrome p=new Palindrome();
		p.checkPalindrome(s);
	}

}
