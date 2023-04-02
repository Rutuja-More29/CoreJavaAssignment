package wriitenAssignment2;

public class ThreadPriorityChangeExample extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ThreadPriorityChangeExample th1=new  ThreadPriorityChangeExample();
		 ThreadPriorityChangeExample th2=new  ThreadPriorityChangeExample();
		 ThreadPriorityChangeExample th3=new  ThreadPriorityChangeExample();
		 
		 th1.setPriority(1);
		 th2.setPriority(5);
		 th3.setPriority(15);
		 
		 System.out.println("Prority of thread th1:"+th1.getPriority());
		 System.out.println("Priority of thread th2:"+th2.getPriority());
		 System.out.println("priority of thread th3:"+th3.getPriority());

	}

}
