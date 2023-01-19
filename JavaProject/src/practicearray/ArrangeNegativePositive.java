package practicearray;

public class ArrangeNegativePositive {
	void arrange(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.print(a[i]+" ");
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,4,-5,3,6,-7,-4,-3,9};
		ArrangeNegativePositive n=new ArrangeNegativePositive();
		n.arrange(a);
	}

}
