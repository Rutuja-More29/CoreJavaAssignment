package practicearray;

public class DuplicateValue {
	void duplicate(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					System.out.println(ar[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {3,10,90,78,56,10,78,34,61};
		DuplicateValue d=new DuplicateValue();
		d.duplicate(ar);

	}

}
