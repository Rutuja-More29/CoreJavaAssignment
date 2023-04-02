package practicestring;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	void check(String s1,String s2) {
		if(s1.length()==s2.length()) {
			char ch[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			
			Arrays.sort(ch);
			Arrays.sort(ch2);
			int flag=1;
			for(int i=0;i<ch.length;i++) {
				if(ch[i]!=ch2[i]) {
					System.out.println("Not Anagram");
					flag=0;
					break;
				}
			}
			if(flag==1) {
				System.out.println("Anagram");
			}
		}
		else
		{
			System.out.println("not");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two String:");
		String s1=sc.next();
		String s2=sc.next();
		
		Anagram a=new Anagram();
		a.check(s1, s2);

	}

}
