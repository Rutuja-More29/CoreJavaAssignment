package com.assignment;

import java.util.Scanner;

public class Box {
	int lenght, width, height, volume;

	void box(int l, int w, int h) {
		lenght = l;
		width = w;
		height = h;
	}

	void calculate() {
		int volume = lenght * width * height;
		System.out.println("Volume of Box:"+volume);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lenght:");
		int l = sc.nextInt();
		System.out.println("Enter Width:");
		int w = sc.nextInt();
		System.out.println("Enter Height");
		int h = sc.nextInt();
		Box b = new Box();
		b.box(l, w, h);
		b.calculate();
	}

}
