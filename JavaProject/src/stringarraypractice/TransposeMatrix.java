package stringarraypractice;
import java.util.Scanner;
public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=3,c=3;
		int	a [][]=new int[r][c];
		System.out.println("Enter element:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) {
			a[i][j]=sc.nextInt();
		}
		}
		System.out.println("original matrix are:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"\t ");
			}
		}
		System.out.println("\n \ntranspose matrix:");
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(a[j][i]+" \t");
			}
		}
	}

}
