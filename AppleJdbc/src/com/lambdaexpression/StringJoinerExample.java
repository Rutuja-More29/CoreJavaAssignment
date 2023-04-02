package com.lambdaexpression;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner str=new StringJoiner(" ");
		str.add("Today's");
		str.add("date");
		str.add("is");
		str.add("03/03/2023");
		System.out.println(str);

	}

}
