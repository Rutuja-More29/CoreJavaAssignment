package practicearray;

public class Replace0to1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {26,0,67,0,45,0,78,54,0,34,10,0,34};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				System.out.print(1+" ");
			}
			else
				System.out.print(arr[i]+" ");
		}

	}

}
