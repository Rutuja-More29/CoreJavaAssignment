package com.pattern;

public class AReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alphabet=65;
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print((char)(alphabet+j));
			}
			System.out.println();
		}
	}

}
