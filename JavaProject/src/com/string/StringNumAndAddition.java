package com.string;
// interview question
public class StringNumAndAddition {

	public static void main(String[] args) {
		String s="Java5Core6Language4";
		char ch[]=s.toCharArray();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
				sum=sum+(ch[i]-48);
				
		}
		System.out.println(sum);
	}

}
