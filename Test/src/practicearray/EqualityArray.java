package practicearray;

public class EqualityArray {
	void check(int arr[],int arr2[]) {
		if(arr.length==arr2.length) {
			System.out.println("equal");
		}else
			System.out.println("not");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int arr2[]= {2,3,4,5,6};
		EqualityArray e=new EqualityArray();
		e.check(arr, arr2);

	}

}
