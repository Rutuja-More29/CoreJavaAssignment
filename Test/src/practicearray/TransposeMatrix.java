package practicearray;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=3,c=3;
		int arr[][]=new int [r][c];
		System.out.println("Enter the element:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Original Array:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("transpose");
		for(int i=0;i<c;i++) {
			for(int j=0;j<r;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
