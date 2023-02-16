package arraypractice;

public class CalculateAvgExceptMaxMin {
	void calculate(int a[]) {
		int max=a[0];
		int min=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=max && a[i]!=min) {
				sum=sum+a[i];
				count++;
			}
		}
		double avg=sum/count;
		System.out.println(avg);
	}
	public static void main(String[] args) {
		int a[]= {10,30,67,88,90,4,12};
		CalculateAvgExceptMaxMin c=new CalculateAvgExceptMaxMin();
		c.calculate(a);

	}

}
