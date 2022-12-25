package stringassignment;

public class Prime {

	public static void main(String[] args) {
		int num=12;
		for(int i=0;i<=num;i++)
		{
			int mid=i/2,j;
			for(j=2;j<i;j++)
			{
				if(i%j==0)
				{
					break;
				}
			}
		
				if(j>mid)
				{
					System.out.println(i);
				}
				
			
		
		}
	}

}
