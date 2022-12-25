package stringassignment;

public class Replace {

	public static void main(String[] args) {
		String s1="hello";
		String s2="morning";
		String regex="\\d+";
		System.out.println(s1.replace("hello", "hii"));
		System.out.println(s2.replaceFirst(regex, " "));

	}

}
