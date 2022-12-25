package arrayassignment;

public class ArrangeNegativePositiveInteger {
	void arrangeNum(int a[])
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
     System.out.println();
	}

	public static void main(String[] args) {
		int a[]= {2,3,5,4,-1,-6,-7,-8};
		ArrangeNegativePositiveInteger n=new ArrangeNegativePositiveInteger();
		n.arrangeNum(a);
		
	}

}
