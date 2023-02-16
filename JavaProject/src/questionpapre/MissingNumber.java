package questionpapre;

public class MissingNumber {
	void display(int a[]) {
		int j=1;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=j) {
				System.out.print(j+" ");
				j++;
			}
			j++;
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,4,5,7,8,9,11,12,15};
		MissingNumber m=new MissingNumber();
		m.display(a);

	}

}
