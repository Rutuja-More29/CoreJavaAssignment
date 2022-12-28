package wrapperclasses;

public class WrapperDemo {

	public static void main(String[] args) {
		int i=10;
		Integer it=new Integer(i);
		Integer it1=i;  //autoBoxing
		
		Integer it2=new Integer(i);
		System.out.println(it==it2);  //memory location
		System.out.println(it.equals(it2)); // content
		
		Integer a=new Integer(100);
		int t=a.intValue();  // unBoxing 1.4
		int g=a;   // auto unBoxing
		Character ch=new Character('s');
		char c=ch;
		char x='l';
		Character cht=x;
	}

}
