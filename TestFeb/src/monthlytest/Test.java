package monthlytest;

public class Test {
	static void overloadedMethod(float ...fs) {
		System.out.println("float var args");
	}
	static void overloadedMethod(Double d) {
		System.out.println("Double Wrapper Class Type");
	}
	static void overloadedMethod(Long l) {
		System.out.println("Long Wrapper Class Type");
	}
	public static void main(String[] args) {
		int i=21;
		overloadedMethod(i);
	}
}
