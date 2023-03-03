package stringpractice;

import java.util.Scanner;

public class VowelToSpecialChar {
	void check(String s) {
		char str[]=s.toCharArray();
		for(int i=0;i<str.length;i++) {
			if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'|| str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U') {
				System.out.print('@'+" ");
			}
			else
			{
				System.out.print(str[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		VowelToSpecialChar v=new VowelToSpecialChar();
		v.check(s);
	}

}
