package arraypractice;

public class SquareNumber {
	void check(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			double sqrt=Math.sqrt(arr[i]);
			if(sqrt==Math.floor(sqrt)) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
	int arr[]= {23,43,25,49,12,9,78,66,39,0};
	SquareNumber s=new SquareNumber();
	s.check(arr);

	}

}
