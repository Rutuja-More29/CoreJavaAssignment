package questionpapre;

class P1 {

}
class Q1 extends P1{
	
}
class R extends P{
	
}
 class Output4{
	 public static void foo(P p)
	 {
		 System.out.println("p");
	 }
	 public static void foo(Q q) {
		 System.out.println("q");
	 }
	public static void foo(R r) {
		System.out.println("r");
	}
	public static void main(String []args) {
		//foo(null);
	}
}