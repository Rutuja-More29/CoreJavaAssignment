package practiceonarray;

public class DuplicateElementPrint {

	public static void main(String[] args) {
		int a[]= {3,10,90,56,78,10,34,78,61};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[j]+" ");
				}
			}
		}

	}

}
