package practiceonarray;

public class PositiveNegative {

	public static void main(String[] args) {
		int a[]= {1,-2,4,-3,5,6,-7,8};
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

}
