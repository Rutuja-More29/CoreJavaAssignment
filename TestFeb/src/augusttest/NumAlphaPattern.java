package augusttest;

import java.util.Scanner;

public class NumAlphaPattern {
	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.print("Enter an odd number: "); int n = sc.nextInt(); int mid = (n
		 * / 2) + 1; int alphabet=65; for (int i = 1; i <= n; i++) { if (i <= mid) { for
		 * (int j = 1; j <= (2 * (mid - i + 1) - 1); j++) { if (j % 2 == 1) {
		 * System.out.print(j); } else { System.out.print(" "); } } } else { for (int j
		 * = 1; j <= (2 * (i - mid) + 1); j++) { if (j % 2 == 1) {
		 * System.out.print((char)((alphabet + j) - 1)); } else { System.out.print(" ");
		 * } } } System.out.println(); }
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter an odd number: ");
		int n = scanner.nextInt();
		scanner.close();

		// Draw the pattern
		for (int i = n; i >= 1; i -= 2) {
			// Draw the numbers or letter
			if (i % 4 == 1) {
				for (int j = 1; j <= i; j++) {
					if (j % 2 == 1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
			} else {
				for (int j = 65; j < 65 + i; j++) {
					if (j % 2 == 1) {
						System.out.print((char) j);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		for (int i = 3; i <= n; i += 2) {
			// Draw the numbers or letters
			if (i % 4 == 1) {
				for (int j = 1; j <= i; j++) {
					if (j % 2 == 1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
			} else {
				for (int j = 65; j < 65 + i; j++) {
					if (j % 2 == 1) {
						System.out.print((char) j);
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
