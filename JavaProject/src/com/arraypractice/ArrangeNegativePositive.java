package com.arraypractice;

public class ArrangeNegativePositive {
	void positiveNegative(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]+" ");
			}
		}
		for(int j=0;j<a.length;j++)
		{
			if(a[j]>0)
			{
				System.out.print(a[j]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,-1,5,-4,6,-3,7};
		ArrangeNegativePositive n=new ArrangeNegativePositive();
		n.positiveNegative(a);
		

	}

}
