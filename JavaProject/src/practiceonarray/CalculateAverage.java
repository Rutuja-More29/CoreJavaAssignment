package practiceonarray;
// calculate average except max and min
import java.util.Arrays;

public class CalculateAverage {

	public static void main(String[] args) {
		int a[]= {5,7,2,4,9};
		System.out.println(Arrays.toString(a));
		int max=a[0];
		int min=a[0];
		float sum=a[0];
		for(int i=1;i<a.length;i++)
		{
			sum=sum+a[i];
			if(a[i]>max)
			max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		float x=((sum-max-min)/(a.length-2));
		System.out.println(x);

	}

}
