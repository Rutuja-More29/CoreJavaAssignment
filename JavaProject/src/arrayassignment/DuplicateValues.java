package arrayassignment;

public class DuplicateValues {

	public static void main(String[] args) {
		int a[]= {3,10,90,56,10,78,34,61};
		System.out.println("duplicate interger value:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
			}
		}

	}

}
