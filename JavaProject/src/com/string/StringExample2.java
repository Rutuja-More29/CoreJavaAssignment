package com.string;

public class StringExample2 {

	public static void main(String[] args) {
		String s="Java Language";
		char ch='a';
		char ch1[]=s.toCharArray();  //use to separate character
		int cnt=0;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]==ch)
			{
				cnt++;
			}
		}
		System.out.println(ch+" "+cnt);
	}

}
