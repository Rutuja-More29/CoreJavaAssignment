package arraypractice;

public class NegativePositiveExample {
	void display(int a[]) {
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				System.out.print(a[i]+" ");
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {12,-1,14,-17,20,-4,-7,9,8};
		NegativePositiveExample np= new NegativePositiveExample();
		np.display(a);
	}

}
