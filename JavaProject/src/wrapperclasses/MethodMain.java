package wrapperclasses;

public class MethodMain {
	void display(int a) {              //primitive data type 1st display int-> float
		                               
		System.out.println("int");      
	}
	void display(Integer a)                      // in wrapper class 1st Integer
	{
		System.out.println("Integer");
	}
	void display(float a)
	{
		System.out.println("float");
	}
	void display(Float a)
	{
		System.out.println("Float");
	}
	void display(Number a)                       // parent class of wrapper class is Number
	{
		System.out.println("Number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodMain mm=new MethodMain();
		mm.display(10);

	}

}
