package practiceonarray;

import java.util.Arrays;

public class SecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-20,0,-25,15,19,37,23};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Second Min:"+a[1]);

	}

}
