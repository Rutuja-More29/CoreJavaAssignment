package com.arraypractice;

public class ArrangeEvenOddNum {
	void evenOdd(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
		
		}
		for(int j=0;j<a.length;j++)
		{
			if(a[j]%2!=0)
			{
				System.out.print(a[j]+" ");
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,6,7,8};
		ArrangeEvenOddNum a1=new ArrangeEvenOddNum();
		a1.evenOdd(a);

	}

}
