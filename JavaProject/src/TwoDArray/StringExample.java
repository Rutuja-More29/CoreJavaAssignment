package TwoDArray;

import java.util.Arrays;

public class StringExample {
	void method(String s[]) {

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + "=" + s[i].length());
		}
		System.out.println(Arrays.toString(s));
		// ascending order
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length - 1; j++) {
				if ((s[j].compareTo(s[j + 1]) > 0)) {
					String temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(s));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = { "core", "java", "advance", "india" };
		StringExample s1=new StringExample();
		s1.method(s);

	}

}
