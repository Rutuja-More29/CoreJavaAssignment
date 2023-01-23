package practiceonarray;

import java.util.Arrays;

public class Reverse {

	public static void main(String[] args) {
	
		int a[]= {3,90,45,70,78,30};
		System.out.println(Arrays.toString(a));
		int n=a.length;
		int mid=n/2;
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[n-1-i];
			a[n-1-i]=temp;
		}
		
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	int a[]= {3,90,45,29,37,78};
		System.out.println(Arrays.toString(a));
		int n=a.length;
		int mid=n/2;
	for(int i=0;i<mid;i++)
	{
		int temp=a[i];
		a[i]=a[n-1-i];
		a[n-1-i]=temp;
	}
	System.out.println(Arrays.toString(a));*/

	}
		
		
		

}
