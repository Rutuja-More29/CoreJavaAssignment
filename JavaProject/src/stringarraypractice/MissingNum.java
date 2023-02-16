package stringarraypractice;

public class MissingNum {

	public static void main(String[] args) {
	int a[]= {1,2,3,5,6};
	int j=1;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!=j)
		{
			System.out.println(j);
			j++;
		}
		j++;
	}

	}

}
