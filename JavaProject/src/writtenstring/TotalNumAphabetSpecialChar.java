package writtenstring;

import java.util.Scanner;

public class TotalNumAphabetSpecialChar {
	void count(int alpha,int digit,int splchar,String s)
	{
		for(int i=0;i<s.length();i++)
		{
		char	ch=s.charAt(i);
			if(ch>='a'&& ch<='z' ||ch >='A'&& ch<='Z')
			{
				alpha++;
			}
			else if(ch>='0'&& ch<='9')
			{
				digit++;
			}
			else
			{
				splchar++;
			}
		}
		System.out.println("Number of Aplhabet:"+alpha);
		System.out.println("Number of Digit:"+digit);
		System.out.println("Number of Special character:"+splchar);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		
		int digit,splchar;
		int alpha =digit=splchar=0;
		TotalNumAphabetSpecialChar a=new TotalNumAphabetSpecialChar();
		a.count(alpha, digit, splchar, s);
		
	}

}
