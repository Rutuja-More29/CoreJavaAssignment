package arraypractice;

public class EqualityArray {
	void check(int a[],int b[]) {
		if(a.length==b.length) {
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.print("Arrays are not equal");
		}
	}
	public static void main(String[] args) {
		int a[]= {12,22,32,42,52};
		int b[]= {52,62,72,12,32};
		EqualityArray e=new EqualityArray();
		e.check(a, b);

	}

}
