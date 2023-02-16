package arraypractice;

public class Replace0with1 {
	void replace(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				System.out.print(1+" ");
			}
			else
				System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
	int a[]= {26,0,67,45,0,78,54,0,10,0,34};
	Replace0with1 r=new Replace0with1();
	r.replace(a);

	}

}
