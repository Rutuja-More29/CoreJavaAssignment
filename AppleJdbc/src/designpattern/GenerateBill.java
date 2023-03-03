package designpattern;

import java.util.Scanner;

public class GenerateBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		GetPlan gp=new GetPlan();
		System.out.println("Enter your plan name:(Home,Commercial,Industrial)");
		String name=sc.next();
		
		Plan p=gp.getUserPlan(name);
		//System.out.println(p);
		
		System.out.println("Enter unit consumed:");
		int unit=sc.nextInt();
		p.getunitRate();
		p.billCalculation(unit);

	}

}
