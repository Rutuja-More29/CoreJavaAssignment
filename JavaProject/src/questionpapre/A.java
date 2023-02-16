package questionpapre;

 abstract class A {
	static String s="1";
	A(){
		s+="2";
	}
}
 class Output extends A{
	Output(){
		this(7);
		s+="3";
	}

	 Output(int x) {
		s+="4";
	}
	 public static void main(String []args)
	 {
		 System.out.println("east"+s+" ");
	 }
	 static {
		 Output2 e=new Output2();
		 System.out.println("west"+s+" ");
	 }
}
