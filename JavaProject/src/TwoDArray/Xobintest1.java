package TwoDArray;

import java.util.Scanner;


public class Xobintest1 {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num of element:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println(a[a.length-2]);
		System.out.println(a[a.length-1]);
	}

}
