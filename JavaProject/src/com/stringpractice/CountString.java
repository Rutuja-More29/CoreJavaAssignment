package com.stringpractice;

import java.util.HashMap;


//WAJP to count the number of word in a String using HashMap
public class CountString {

	public static void main(String[] args) {
		String str="the the sky is blue blue";
		String s[]=str.split(" ");
		HashMap<String ,Integer> hm=new HashMap<>();
		for(int i=0;i<s.length;i++)
		{
			if(hm.containsKey(s[i]))
			{
				int count=hm.get(s[i]);
				hm.put(s[i], count+1);
			}
			else
			{
				hm.put(s[i],1);
			}
		}
		System.out.println(hm);
	}

}
