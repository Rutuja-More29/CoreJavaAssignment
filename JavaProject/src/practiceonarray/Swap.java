package practiceonarray;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int a[]= {2,4,0,9};
		int n=a.length;
		int mid=n/2;
		for(int i=0;i<mid;i++)
		{
			int temp=a[i];
			a[i]=a[mid+i];
			a[mid+i]=temp;
			
		}
		System.out.println(Arrays.toString(a));
	}

}
