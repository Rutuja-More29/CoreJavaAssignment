package practicestring;
import java.util.Scanner;
public class DigitAlphaSpecialchar {
	void check(int alpha,int digit,int splchar,String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
			{
				alpha++;
			}
			else if(ch>='0' && ch<='9')
			{
				digit++;
			}
			else
			{
				splchar++;
			}
		}
		System.out.println("Alphabet:"+alpha);
		System.out.println("digit:"+digit);
		System.out.println("special character:"+splchar);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int alpha,splchar,digit;
		alpha=splchar=digit=0;
		DigitAlphaSpecialchar a=new DigitAlphaSpecialchar();
		a.check(alpha, digit, splchar, s);
	}

}
