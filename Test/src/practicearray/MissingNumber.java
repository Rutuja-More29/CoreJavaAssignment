package practicearray;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,6,8,9};
		int j=1;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]!=j) {
				System.out.println(j);
				j++;
			}
			j++;
		}

	}

}
