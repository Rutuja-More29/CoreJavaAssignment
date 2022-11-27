package com.classandobject;
import java.util.Scanner;
public class BonusPfCalculator {
	float bonus(int salary , char ch)
	{
		float newSal;
		System.out.println("Original Salary:"+salary);
		if(ch=='A')
			newSal=salary+(salary*0.15f);
			else if(ch=='B')
				newSal=salary+(salary*0.10f);
			else if(ch=='C')
				newSal=salary+(salary*0.05f);
			else
				newSal=salary;
		System.out.println("Salary after adding bonus:"+newSal);
		return newSal;
		
	}
	void pfCalculator(float salary)
	{
		float pf=salary*0.10f;
		System.out.println("Enter pf:"+pf);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sal;
		char ch;
		System.out.println("Enter salary and (A/B/C/D) rating employee:");
		sal=sc.nextInt();
		ch=sc.next().charAt(0);
		BonusPfCalculator bpc=new BonusPfCalculator();
		// bpc.bonus(sal, ch); // bonus
		// bpc.pfCalculator(bpc.bonus(sal, ch)); // here we direct use method
		float newsal=bpc.bonus(sal, ch);// here we store method in newsal
		bpc.pfCalculator(newsal); // here we call newsal then
	}

}
