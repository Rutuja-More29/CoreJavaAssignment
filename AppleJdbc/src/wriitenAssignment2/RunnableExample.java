package wriitenAssignment2;

public class RunnableExample implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Ruunable example");
		
		
	}
	public static void main(String[] args) 
		
	{
		// TODO Auto-generated method stub
		RunnableExample re=new RunnableExample();
		Thread th=new Thread();
		th.start();

	}
}
