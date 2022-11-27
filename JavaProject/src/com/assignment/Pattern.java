package com.assignment;

public class Pattern {
	private static int n;
	Pattern(int n)
	{
		this.n=n;  // use for how many rows to print
	}

	public static  void  alphabet() {
		
		int alphabet = 65;
		for (int i = n; i >= 0; i--) {      //  printing rows
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (alphabet + j)+" " );
			}
			System.out.println();
		}
		for (int i = 0; i <= n; i++) {       
			for (int j = 0; j <= i; j++) {    
				System.out.print((char) (alphabet + j) + " ");
			}
			System.out.println();
		}
		
	}
	public static void main (String args[]) {
		new Pattern(5).alphabet();
	}
		

	

}
