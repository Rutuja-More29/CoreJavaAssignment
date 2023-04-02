package practicestring;

import java.util.Scanner;

public class ConvertVowelsToSplChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' ||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				System.out.print('@'+" ");
			}else
			{
				System.out.print(ch[i]+" ");
			}
		}

	}

}
