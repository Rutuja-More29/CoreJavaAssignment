package com.inheritanceparentchild;

public class DateTimeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mytime mt=new Mytime();
		mt.setHrs(11);
		mt.setMin(35);
		mt.setSec(40);
		mt.setDd(28);
		mt.setMm(11);
		mt.setYy(2022);
		System.out.println(mt.getHrs()+" "+mt.getMin()+" "+mt.getSec()+" "+mt.getDd()+" "+mt.getMm()+" "+mt.getYy());
	}

}
