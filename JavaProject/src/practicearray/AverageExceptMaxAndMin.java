package practicearray;

public class AverageExceptMaxAndMin {
	void average(int arr[])
	{
		int max=arr[0];
		int min=arr[0];
		int sum=0;
		float average=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
			average=(sum-max-min)/arr.length;
			
		}
		System.out.println(average);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,5,6,7,8,9};
		AverageExceptMaxAndMin a=new AverageExceptMaxAndMin();
		a.average(arr);

	}

}
