package com.inheritanceparentchild;

class GrandFather{
	String fn,mn;
	static String ln="More";
	public void setFn(String fn) {
		this.fn = fn;
	}
	public void setMn(String mn) {
		this.mn = mn;
	}
	public static void setLn(String ln) {
		GrandFather.ln = ln;
	}
	void display()
	{
		System.out.println("GrandFather info:");
	System.out.println(fn+" "+mn+" "+ln);
	}
}
class Father1 extends GrandFather{
	String fn1;

	public void setFn1(String fn1) {
		this.fn1 = fn1;
	}
	void display()
	{
		System.out.println("Father Info:");
		System.out.println("Father 1st name:"+fn1);
		System.out.println("Father mid name:"+super.fn);
		System.out.println("Father last name:"+Father1.ln);
	}
	
}
class Child extends Father1{
	String fn2;

	public void setFn2(String fn) {
		this.fn2 = fn2;
	}
	void display()
	{
		System.out.println("Child info:");
		System.out.println("child First name:"+fn2);
		System.out.println("child mid name:"+super.fn1);
		System.out.println("child last name:"+Child.ln);
	}
}
public class GrandFatherFather1Child {

	public static void main(String[] args) {
		GrandFather g=new GrandFather();
		
		g.setFn("ram");
		g.setMn("abcd");
		g.display();
		
		Father1 f=new Father1();
		f.setFn1("sham");
		
		f.display();
		
		
		Child c=new Child();
		c.setFn2("bbbb");
		c.display();
		
		
		
		
		
		

	}

}
