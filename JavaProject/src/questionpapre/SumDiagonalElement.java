package questionpapre;
import java.util.Scanner;
public class SumDiagonalElement {
	void sumOfDiagonal(int a[][])
	{
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j)
					sum=sum+a[i][j];
			}
		}
		System.out.println("Sum of diagonal element:"+sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r=4,c=4;
		int a[][]=new int[r][c];
		System.out.println("Enter the element:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		SumDiagonalElement s=new SumDiagonalElement();
		s.sumOfDiagonal(a);

	}

}
