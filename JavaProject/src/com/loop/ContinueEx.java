package com.loop;

public class ContinueEx {

	public static void main(String[] args) {
		int limit=20,c=0;
		while(c<=20)
		{
			c++;
			if(c%3==0)
			{
				continue;
			}
			System.out.println(c);
		}

	}

}
