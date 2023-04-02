package monthlytest;

import java.util.HashSet;

public class UniquePairOfInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,3,5,6,-2,4,4,7,8,9};
		int sum=7;
		HashSet<Integer>set=new HashSet<Integer>();
		HashSet<Integer>hst=new HashSet<>();
		for(int num1:arr) {
			int target=sum-num1;
			if(set.contains(target)) {
				hst.add((Math.min(num1, target)*10+Math.max(num1, target)));
			}
			set.add(num1);
		}
		for(int pair:hst) {
			int num1=pair/10;
			int num2=pair%10;
			System.out.println(num1+" "+num2);
		}


	}

}
