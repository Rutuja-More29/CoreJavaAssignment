package com.stringpractice;

import java.util.Scanner;

public class AllOccuranceWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		int count,wordlen;
		String word[]=s.split(" ");
		wordlen=word.length;
		System.out.println("Occurance of each word:");
		for(int i=0;i<wordlen;i++)
		{
			String w=word[i];
			count=1;
			for(int j=(i+1);j<wordlen-1;j++)
			{
				if(w.equals(word[j]))
				{
					count++;
					for(int k=j;k<wordlen-1;k++)
					{
						word[k]=word[k+1];
					}
					wordlen--;
					j--;
				}
			}
			System.out.println(word+"occur"+count);
			count=0;
		}

	}

}
