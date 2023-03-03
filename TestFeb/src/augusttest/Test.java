package augusttest;

public class Test {
	int count=0;
	void A() throws Exception
	{
		try {
			count++;
			try {
				count--;
				try {
					count=count+2;
					throw new Exception();
				}
				catch(Exception ex) {
					count++;
					throw new Exception();
				}
			}
			catch(Exception ex) {
				count=count+3;
			}
		}
		catch(Exception ex) {
			count++;
		}
		
	}
	void display()
	{
		System.out.println(count);
	}

	public static void main(String[] args) throws Exception {
		Test obj=new Test();
		obj.A();
		obj.display();

	}

}
