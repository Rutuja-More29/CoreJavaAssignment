package com.string;
// without using method
public class ArrayString {

	public static void main(String[] args) {
	String str[]= {"Raj","Veer","Rahul","Shubham","Anjali","Reena","Leena"};
	
	
	for(int i=0;i<str.length;i++)
	{
		char ch[]=str[i].toCharArray();
		//start with
		if(ch[0]=='R')
		{
			String s=new String(ch);
			System.out.println("Start with R:"+s);
		}
		// end with
		if(ch[ch.length-1]=='a')
		{
			String s=new String(ch);
			System.out.println(s);
		}
	}
	
	
	

	}

}
