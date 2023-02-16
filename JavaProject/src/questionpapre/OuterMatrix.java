package questionpapre;

import java.util.Scanner;

// WAP to display outer element of nXm matrics
public class OuterMatrix {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=sc.nextInt();
		System.out.println("Enter the number of column:");
		int m=sc.nextInt();
		int [][]matrix=new int[n][m];
		System.out.println("Enter the element of matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("the outer elements of the matrix:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i==0||i==(n-1)|| j==0||j==(m-1)) {
					System.out.println(matrix[i][j]+" ");
				}
			}
		}
	}
}
