package writtenarray;

import java.util.Arrays;
import java.util.Scanner;

public class ReplaceNegativeValue {
	void replaceNegativeNum(int arr[])
	{
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i]=arr[i-1]*arr[i-1];
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int arr[]= {12,3,-19,29,5,-61,44,7,-9};
		ReplaceNegativeValue rnv=new ReplaceNegativeValue();
		rnv.replaceNegativeNum(arr);
	}

}
