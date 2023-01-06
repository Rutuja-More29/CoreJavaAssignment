package TwoDArray;

public class ArrayExample {
	void check(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=5)
			{
				if(a[i]%2==0)
				{
				sum=sum+1;	
				}
				else
				{
					sum=sum+3;
				}
			}
			else
			{
				sum=sum+5;
			}
				
		}
		System.out.println(sum);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,5};
		
		ArrayExample a1=new ArrayExample();
		a1.check(a);
		

	}

}
