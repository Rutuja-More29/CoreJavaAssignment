package com.pattern;

public class A1Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alphabet=65;
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alphabet+j));
			}
			System.out.println();
		}
	}

}
