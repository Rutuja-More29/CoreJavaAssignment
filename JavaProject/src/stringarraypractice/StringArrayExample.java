package stringarraypractice;


public class StringArrayExample {

	public static void main(String[] args) {
		String s[] = { "rahul", "shubham", "nita", "piyusha", "shubham", "ansika", "nita" };
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] == s[j]) {
					System.out.print(s[j] + " ");
				}

			}
		}

	}

}
