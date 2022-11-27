package com.pattern;

public class HollowPattern {

	public static void main(String[] args) {
		// --------hollow square pattern------
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 0 || i == 5 - 1 || j == 0 || j == 5 - 1)
					System.out.print("*" + " "); // print star and then space
				else
					System.out.print(" " + " "); // spaces between star
			}
			System.out.println();
		}
		System.out.println("------------pattern2---------");
		for (int i = 1; i <= 5; i++) {
			for(int k=1;k<=i;k++) {
				if(i%2==0)
					System.out.print("-");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int k=1;k<=i;k++) {
				if(i%2==0)
					System.out.print("-");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	//	System.out.println();
	}

}
