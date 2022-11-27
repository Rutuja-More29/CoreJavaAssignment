package com.classandobject;

public class PuneCollege {
	int id,dno,studno;
	String name,location;
	static String uniname="pune university";// class variable
	static String state="maharastra";
	PuneCollege(int i,String n,int d,String l,int stud)
	{
		id=i;
		name=n;
		dno=d;
		location=l;
		studno=stud;
	}
	public static void main(String[] args) {
		System.out.println(PuneCollege.uniname+" ");
		

	}

}
