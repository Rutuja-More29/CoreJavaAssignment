package arrayassignment;

public class MaxRows {
	void max(int a[][])
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i][j]>max)
					max=a[i][j];
			}
			
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int a[][]= {{22,31,9},{12,25,16}};
		MaxRows m=new MaxRows();
		m.max(a);
		
		
			
			
		
		
	}

}
