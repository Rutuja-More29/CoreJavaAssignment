package stringpractice;

import java.util.Scanner;

public class EncryptedAlphabet {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s1=sc.nextLine();
		String s[]=s1.split(" ");
		int sum=0;
		for(int i=0;i<s.length;i++) {
			char ch[]=s[i].toCharArray();
			for(int j=0;j<ch.length;j++) {
				int a=ch[j]-64;
				sum=sum+a;
			}
			System.out.println(s[i]+": "+sum);
		}
		

	}

}
