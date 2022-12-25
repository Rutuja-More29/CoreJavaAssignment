package arrayassignment;

public class CommanValue {

	public static void main(String[] args) {
		int a[]= {12,34,67,78,61,56};
		int b[]= {78,37,29,34,61,56};
		System.out.println("Comman Element:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}
			}
		}

	}

}
