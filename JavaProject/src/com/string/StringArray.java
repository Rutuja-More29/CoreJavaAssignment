package com.string;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		String str[]= {"Raj","Veer","Rahul","Shubham","Anjali","Reena","Leena"};
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]+" = "+str[i].length());
		}
		System.out.println(Arrays.toString(str));
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length-1;j++)
			{
				if(str[j].compareTo(str[j+1])>0)
				{
					String t=str[j];
					str[j]=str[j+1];
					str[j+1]=t;
				}
			}
			
		}
		System.out.println(Arrays.toString(str));

	}

}
