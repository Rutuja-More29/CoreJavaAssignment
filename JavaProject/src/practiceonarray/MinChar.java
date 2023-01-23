package practiceonarray;

import java.util.Arrays;

public class MinChar {

	public static void main(String[] args) {
		char a[]= {'A','B','C','a','z','R'};
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
		System.out.println(a[0]);

	}

}
