package TwoDArray;

public class ArrayExample2 {
	void method(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==10)
				{
					System.out.println(a[i]+" "+a[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,7,8,9};
		
		ArrayExample2 a2=new ArrayExample2();
		a2.method(a);
	}

}
