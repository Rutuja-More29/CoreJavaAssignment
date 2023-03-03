package stringpractice;

public class RemoveAllOccuranceWord {

	public static void main(String[] args) {

		String s = "core java advance java session ";
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (str[i].equalsIgnoreCase("java")) {
				continue;
			} else {
				System.out.print(str[i] + " ");
			}
		}

	}

}
