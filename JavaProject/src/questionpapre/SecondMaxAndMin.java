package questionpapre;

public class SecondMaxAndMin {
	void secondMaxAndMin(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
					
			}
		}
		System.out.println("second max:"+a[a.length-2]);
		System.out.println("second min:"+a[2]);
	}

	public static void main(String[] args) {
		int a[]= {2,1,5,78,90,45,3};
		SecondMaxAndMin s=new SecondMaxAndMin();
		s.secondMaxAndMin(a);

	}

}
