package com.loop;

public class OddNumber {

	public static void main(String[] args) {
		int num = 229,i=529;
		/*for (int i = 529; i >= num; i--) {
			if (i % 2 != 0) {
				System.out.println(i);
			}*/
		while(i>=num) {
			if(i%2!=0) {
				i--;
			}
				System.out.println(i);
			
		}

	}

}
