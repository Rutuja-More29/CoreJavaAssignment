package com.exception;

import java.io.FileInputStream;
import java.io.IOException;
//compile time
public class Test1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis= new FileInputStream("D://textfile.txt");
			int i;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.println();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("Done");

	}

}
