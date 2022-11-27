package com.pattern;

public class DownwardRightAngle {

	public static void main(String[] args) {
		int num=5;
		int alphabet=65;
		for(int i=0;i<=num;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print((char)(alphabet+k)+" ");
			}
			System.out.println();
		}

	}

}
