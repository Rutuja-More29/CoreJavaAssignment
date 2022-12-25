package arrayassignment;

import java.util.Arrays;

public class ReplaceNum {
	void replace(int a[])
	{
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.print(1+" ");
			}
			else
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {26,0,67,45,0,78,54,34,10,0,34};
		int a=arr.length;
		ReplaceNum r=new ReplaceNum();
		r.replace(arr);

	}

}
