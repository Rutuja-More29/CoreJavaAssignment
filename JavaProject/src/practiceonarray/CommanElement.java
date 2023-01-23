package practiceonarray;

public class CommanElement {

	public static void main(String[] args) {
		int a[]= {18,34,56,78,90,3,1};
		int b[]= {23,34,78,9,45,12,2};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(b[j]);
				}
			}
		}

	}

}
