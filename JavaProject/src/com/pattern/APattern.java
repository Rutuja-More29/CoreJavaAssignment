package com.pattern;

public class APattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alphabet=65;
		for(int i=4;i>=0;i--) {
			for(int j=4;j>=i;j--) {
				System.out.print((char)(alphabet+j));
			}
			System.out.println();
		}
	}

}
