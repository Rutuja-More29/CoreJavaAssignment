package com.loop;

public class BreakEx {

	public static void main(String[] args) {
		int limit=20,c=0;
		while(c<=20)
		{
			c++;
			if(c%5==0)
			{
				break;
			}
			System.out.println(c);
		}
		System.out.println("out of while loop"+c);
	}

}
