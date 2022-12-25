package stringassignment;

public class CopyString {

	public static void main(String[] args) {
		String s1="java";
		String s2="programming";
		System.out.println(s1);
		
		System.out.println(String.copyValueOf(s1.toCharArray()));
		

	}

}
