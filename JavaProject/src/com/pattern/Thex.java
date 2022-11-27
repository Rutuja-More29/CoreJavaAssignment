package com.pattern;

public class Thex {

	public static void main(String[] args) {
		
		  for (int i = 1; i <= 5; i++) { // row increment for
		  for  (int j = 1; j <= i; j++)
		  {                                // space increment 
		  System.out.print(" "); } 
		 for (int k = 1; k <= (5 - i + 1); k++)
		   {  if (k == 1)
		    System.out.print("*");
		     else System.out.print("_*");
		 } 
		  System.out.println();
		 
		  }
		 

	}
}