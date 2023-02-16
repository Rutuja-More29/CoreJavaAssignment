package questionpapre;

import java.util.Scanner;

public class CartMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter item no:");
		int itemno = sc.nextInt();
		System.out.println("Enter item name:");
		String name = sc.next();
		System.out.println("Enter item qty:");
		int qty = sc.nextInt();
		System.out.println("Enter item rate:");
		int rate = sc.nextInt();
		Cart c = new Cart(itemno, name, qty, rate);
		int totalPrice = c.getQty() * c.getRate();
		int discount = 0;
		if (totalPrice > 100) {
			discount = 100;
		} else if (totalPrice > 900) {
			discount = 80;
		} else if (totalPrice > 600) {
			discount = (c.getItemno() == 111) ? 50 : 40;
		} else {
			discount = 20;
		}
		System.out.println("discount:" + discount);
		System.out.println("total price:" + (totalPrice - discount));
	}

}
