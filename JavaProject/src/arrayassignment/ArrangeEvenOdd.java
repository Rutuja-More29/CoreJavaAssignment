package arrayassignment;

public class ArrangeEvenOdd {
	void arrangeEvenOdd(int a[])
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
		System.out.println();
	}

	public static void main(String[] args) {
		int a[]= {3,9,1,4,8,6};
		ArrangeEvenOdd e=new ArrangeEvenOdd();
		e.arrangeEvenOdd(a);
	}

}
