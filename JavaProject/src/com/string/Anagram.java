package com.string;
//interview question
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="olleH";
		if(s1.length()==s2.length())
		{
			char a[]=s1.toCharArray();
			char b[]=s2.toCharArray();
			Arrays.sort(a);      // use sort method
			Arrays.sort(b);
			int flag=1;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					System.out.println("Not anagram");
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println("Anagram");
		}
		else
			System.out.println("Not equal");
		
		
	}

}
