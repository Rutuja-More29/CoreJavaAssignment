package stringarraypractice;
import java.util.Scanner;
public class CountVowelConsonantDigit {
	void count(String s,int alpha,int digit,int splchar)
	{
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z' || ch[i]>='a' && ch[i]<='z')
			{
				alpha++;
			}
			else if(ch[i]>='0' && ch[i]<='9')
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
		System.out.println("splcharacter:"+splchar);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int alpha,digit,splchar;
		alpha=digit=splchar=0;
		CountVowelConsonantDigit cvcd=new CountVowelConsonantDigit();
		cvcd.count(s, alpha, digit, splchar);
	}

}
