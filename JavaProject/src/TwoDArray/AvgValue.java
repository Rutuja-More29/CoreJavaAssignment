package TwoDArray;

public class AvgValue {

	public static void main(String[] args) {
		int n[]=new int [] {20,30,25,35,-16,60,-100};
		int sum=0;
		double avg=0;
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
			 avg=sum/n.length;
			
		}
		System.out.println(avg);
	}

}
