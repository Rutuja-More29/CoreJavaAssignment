package arraypractice;

public class SecondMin {
	void check(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(a[2]);
	}
	public static void main(String[] args) {
		int a[]= {10,6,80,30,2,100,90};
		SecondMin s=new SecondMin();
		s.check(a);

	}

}
