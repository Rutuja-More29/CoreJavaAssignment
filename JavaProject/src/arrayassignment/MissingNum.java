package arrayassignment;

public class MissingNum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6,7};
		int j=1;
		System.out.println("Missing Number:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=j)
			{
				System.out.println(j);
				j++;
			}
			j++;
		}

	}

}
