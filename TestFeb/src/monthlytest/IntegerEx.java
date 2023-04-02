package monthlytest;

public class IntegerEx {

	public IntegerEx(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerEx i=new IntegerEx("2000");
		IntegerEx j=i;
		IntegerEx k=new IntegerEx("220");
		System.out.println(i==j);
		System.out.println(k==j);
	}
	

}
