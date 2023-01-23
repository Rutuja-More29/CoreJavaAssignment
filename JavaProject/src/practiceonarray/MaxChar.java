package practiceonarray;

public class MaxChar {

	public static void main(String[] args) {
		char a[]= {'A','B','C','a','x','z','R'};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					char temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(a[a.length-1]);
	}

}
