package practicestring;

import java.util.Scanner;

public class EncryptedAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		String str[]=s.split(s);
		/*char ch[]=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='Z'|| ch[i]>='a'&&ch[i]<='z') {
				sum=sum+(ch[i]-64);
			}
		}
		System.out.println(sum);*/
		int sum=0;
		for(int i=0;i<str.length;i++) {
			char ch[]= str[i].toCharArray();
			for(int j=0;j<ch.length;j++) {
				
					sum=sum+(ch[i]-64);
				
				
			}
			System.out.println(str[i]+" : "+sum);
			
		}

	}

}
