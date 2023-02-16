package stringarraypractice;

public class SecondMaxMin {

	public static void main(String[] args) {
		int a[]= {1,2 ,3,4,3,80,5};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		System.out.println("Second max:"+a[a.length-1]);
		System.out.println("Second min:"+a[1]);

	}

}
