package practicearray;

public class CommanElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int arr2[]= {2,3,6,7,8};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr[i]==arr2[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}
