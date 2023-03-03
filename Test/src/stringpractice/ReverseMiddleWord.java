package stringpractice;

import java.util.Scanner;

public class ReverseMiddleWord {
	void reverse(String s) {
		String str[]=s.split(" ");
		int n=str.length;
		if(n<=2) {
			System.out.println(s);
		}
		int middle=n/2;
		if(n%2==0) {
			middle--;
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++) {
			if(i==middle) {
				sb.append(new StringBuilder(str[i]).reverse());
			}else
			{
				sb.append(str[i]);
			}
			if(i!=n-1) {
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.nextLine();
		
		ReverseMiddleWord r=new ReverseMiddleWord();
		r.reverse(s);

	}

}
