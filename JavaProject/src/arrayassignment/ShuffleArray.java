package arrayassignment;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {
	void shuffle(int a[],int n)
	{
		Random r=new Random();
		for(int i=n-1;i>0;i--)
		{
			int j=r.nextInt(i+1);
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("Shuffle Array:"+Arrays.toString(a));
	}

	public static void main(String[] args) {
		int a[]= {5,6,23,67,39,10,2};
		System.out.println("Original Array:"+Arrays.toString(a));
		int n=a.length;
		ShuffleArray s=new ShuffleArray();
		s.shuffle(a, n);
	}

}
