package com.practice;

public class NumberPattern {

	public static void main(String[] args) {
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if(j%2==0)
					System.out.print(0);
				else
					System.out.print(1);
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0)
					System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--) {
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=(5-i);k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
