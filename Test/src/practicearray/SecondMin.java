package practicearray;

public class SecondMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,5,8,9,23};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(arr[2]);

	}

}
