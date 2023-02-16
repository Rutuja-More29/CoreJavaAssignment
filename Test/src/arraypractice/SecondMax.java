package arraypractice;

public class SecondMax {
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
		System.out.println(a[a.length-2]);
	}

	public static void main(String[] args) {
		int a[]= {10,50,70,3,8,60};
		SecondMax s= new SecondMax();
		s.check(a);

	}

}
