package practicearray;

public class SecondMax {

	public static void main(String[] args) {
		int arr[]= {1,2,5,0,7,8,12};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			
			}
			
		}
		System.out.println(arr[arr.length-2]);

	}

}
