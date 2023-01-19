package practicearray;

import java.util.Arrays;

public class SwapArray {
	void swap(int a[])
	{
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,9,0};
		SwapArray s=new SwapArray();
		s.swap(a);
		
	}

}
