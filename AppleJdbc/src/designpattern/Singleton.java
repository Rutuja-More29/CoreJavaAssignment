package designpattern;

public class Singleton {
	String str;
	//1.private static member
	static Singleton obj=null;
	//private static Singleton obj=new Singleton(); // early instantiation
	
	//2.private constructor
	private Singleton() {
		str="ThinkQuotient";
	}
	//3.static method
	static Singleton getInstance() {
		if(obj==null) {
			obj= new Singleton(); //lazy instantiation
		}
		return obj;
	}
	public String toString() {
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		Singleton s3=Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("--------------------");
		s1.str=s1.str.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		

	}

}
