package com.lambdaexpression;

import java.util.ArrayList;

public class ForEachMethod {
	public static void main(String[] args) {
		ArrayList <Integer>al=new ArrayList<>();
		al.add(11);
		al.add(10);
		al.add(22);
		al.add(33);
		al.add(157);
		al.add(50);
		al.add(697);
		
		al.forEach(n->System.out.println(n));
	}
}
