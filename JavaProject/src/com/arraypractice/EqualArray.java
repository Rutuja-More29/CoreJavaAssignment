package com.arraypractice;

public class EqualArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 12, 22, 32, 42, 52, 62 };
		int arr2[] = { 52, 22, 62, 12, 42, 22 };

		if (arr1.length == arr2.length) {
			System.out.println("Arrays are equal");
		} else
			System.out.println("Arrays are not equal");

	}

}
