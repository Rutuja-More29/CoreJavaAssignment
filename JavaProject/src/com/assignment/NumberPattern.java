package com.assignment;

public class NumberPattern {
	int n;
	//NumberPattern(int n){
	//	this.n=n;
//	}

	public static void main(String[] args) {
		int n=10;
	/*for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=i;k>=1;k--) {
			System.out.print(k);
		}
		for(int k=2;k<=i;k++) {
		System.out.print(k);
		}
		System.out.println();
	}*/
	/*	for(int i=1;i<n;i++)
		{
			for(int k=i;k<n;k++) {
				System.out.print(k);
			}
			for(int j=8;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		for(int i=1;i<10;i++)
		{
			for(int j=1;j<i;j++)   // for spaces
			{
				System.out.print(" ");
			}
			for (int k=i;k<10;k++) {
				System.out.print(k);
			}
			for(int l=8;l>=i;l--)
			{
				System.out.print(l);
			}
			System.out.println();
		}

	}

}
