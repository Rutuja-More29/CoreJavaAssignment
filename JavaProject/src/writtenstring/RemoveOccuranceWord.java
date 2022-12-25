package writtenstring;

import java.util.Arrays;

public class RemoveOccuranceWord {

	public static void main(String[] args) {
		String s = "java language core java session advance java";
		String str[] = s.split(" ");
		System.out.println(Arrays.toString(str));
		String str1[] = new String[str.length];
		int j = 0;
		String s1 = " ";
		for (int i = 0; i < str.length; i++) {
			if (str[i].equalsIgnoreCase("java")) {
				continue;
				
			}
			else 
			{
				s1 = s1 + str[i] + " ";
			}
		}
		System.out.println(s1);
	}

}
