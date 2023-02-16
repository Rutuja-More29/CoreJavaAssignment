package arraypractice;

public class MissingNumber {
	 void check(int a[]) {
		 int j=1;
		 for(int i=0;i<a.length;i++) {
			 if(a[i]!=j) {
				 System.out.println(j);
				 j++;
			 }
			 j++;
		 }
	 }
	public static void main(String[] args) {
		int a[]= {1,2,3,5,6};
		MissingNumber m=new MissingNumber();
		m.check(a);
	}

}
