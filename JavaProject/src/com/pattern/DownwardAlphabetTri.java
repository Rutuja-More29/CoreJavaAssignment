package com.pattern;

public class DownwardAlphabetTri {

	public static void main(String[] args) {
		int alphabet=65;
		for(int i=6;i>=0;i--) {
			for(int k=0;k<=i;k++) {
	
				System.out.print((char)(alphabet+k)+" ");
			}
			System.out.println();
		}
		
		
	}

}
