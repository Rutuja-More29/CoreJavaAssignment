package practicearray;

public class AverageNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,7,8,6};
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max>arr[i])
				max=arr[i];
			else if(min<arr[i])
				min=arr[i];
		}
		int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=max && arr[i]!=min) {
				sum=sum+arr[i];
				count++;
			}
			
		}
		double avg=sum/count;
		System.out.println(avg);

	}

}
