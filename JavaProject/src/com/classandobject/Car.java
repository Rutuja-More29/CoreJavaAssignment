package com.classandobject;

import java.util.Scanner;

public class Car {
	String name, color, mop;
	int speed, price;

	void setData(String n, String c, int s, int p, String mp) {
		name = n;
		color = c;
		speed = s;
		price = p;
		mop = mp;
	}

	void discount() {
		float discount;
		System.out.println("Mode of Payment:" + mop);
		if (mop.equals("online")) {
			discount = price * 0.05f;
			System.out.println("Discount is:" + discount);
			System.out.println("new Price:" + (price - discount));
		}

	}

	void display() {
		System.out.println(name + " " + color + " " + price + " " + speed);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name,color,price,speed,mop(online/cash):");
		String n = sc.next();
		String c = sc.next();
		int s = sc.nextInt();
		int p = sc.nextInt();
		String mp = sc.next();
		Car k = new Car();
		k.setData(n, c, s, p, mp);
		k.discount();
		k.display();

	}

}
