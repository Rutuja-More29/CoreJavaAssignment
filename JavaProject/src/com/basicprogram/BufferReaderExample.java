package com.basicprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExample {

	public static void main(String[] args) throws IOException {
		int fact=1;
		InputStreamReader input=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(input);
		System.out.println("Enter element:");
		String s=br.readLine();
		int num=Integer.parseInt(s);
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
