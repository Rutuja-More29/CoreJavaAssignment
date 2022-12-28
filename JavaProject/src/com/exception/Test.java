package com.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
// compile time
public class Test {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("D://textfile.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		System.out.println();
		
	}

}
